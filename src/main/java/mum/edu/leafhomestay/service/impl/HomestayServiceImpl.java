package mum.edu.leafhomestay.service.impl;


import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.domain.Wishlist;
import mum.edu.leafhomestay.exception.HomestayNotFoundException;
import mum.edu.leafhomestay.repository.BedTypeRepository;
import mum.edu.leafhomestay.repository.HomestayRepository;
import mum.edu.leafhomestay.repository.HomestayTypeRespository;
import mum.edu.leafhomestay.repository.UserRepository;
import mum.edu.leafhomestay.service.HomestayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class HomestayServiceImpl implements HomestayService {
    @Autowired
    HomestayRepository homeStayRepository;

    @Autowired
    BedTypeRepository bedTypeRepository;

    @Autowired
    HomestayTypeRespository homestayTypeRespository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Homestay addHomeStay(Homestay homestay) {
        return homeStayRepository.save(homestay);
    }

    @Override
    public Homestay updateHomeStay(Homestay homestay) {
        Homestay updatedHomeStay = homeStayRepository.findById(homestay.getId()).orElse(null);
        if (updatedHomeStay != null) {
            updatedHomeStay = homestay;
            return homeStayRepository.save(updatedHomeStay);

        }

        return null;
    }

    @Override
    public void deleteHomeStay(Long id) {
        homeStayRepository.deleteById(id);
    }

    @Override
    public Homestay getHomestayById(Long id) {
        return homeStayRepository.findById(id).orElseThrow(() -> new HomestayNotFoundException(id, null));
    }

    @Override
    public List<Homestay> getAllHomeStay() {
        return (List<Homestay>) homeStayRepository.findAll();
    }

    @Override
    public List<Homestay> getWishlist(String email) {

        User user = userRepository.findByEmail(email);

        return user.getWishlists().stream().map(Wishlist::getHomestay).collect(Collectors.toList());
    }

    @Override
    public List<Homestay> getByOwnerId(Long ownerId) {
        return homeStayRepository.findByOwnerId(ownerId);
    }
}
