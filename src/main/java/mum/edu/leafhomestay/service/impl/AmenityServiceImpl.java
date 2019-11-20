package mum.edu.leafhomestay.service.impl;

import mum.edu.leafhomestay.domain.Amenity;
import mum.edu.leafhomestay.repository.AmenityRepository;
import mum.edu.leafhomestay.service.AmenityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmenityServiceImpl implements AmenityService {

    @Autowired
    AmenityRepository amenityRepository;

    @Override
    public List<Amenity> findAll() {
        return (List<Amenity>) amenityRepository.findAll();
    }
}
