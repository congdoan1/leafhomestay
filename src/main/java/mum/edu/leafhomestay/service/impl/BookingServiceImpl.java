package mum.edu.leafhomestay.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.leafhomestay.domain.Booking;
import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.repository.BookingRepository;
import mum.edu.leafhomestay.service.BookingService;




@Service
@Transactional
public class BookingServiceImpl implements BookingService{
	
	  @Autowired BookingRepository bookingRepository;
	  
	  @Override public void saveUserBooking(Booking newbook) { // TODO
	 // Auto-generated method stub
		  bookingRepository.save(newbook); }

	@Override
	public List<Booking> findAll() {
		// TODO Auto-generated method stub
		
		 List<Booking> book=(List<Booking>) bookingRepository.findAll();
		return book;
	}

	@Override
	public User  findByUserId(Long id) {
		// TODO Auto-generated method stub
		
		List<Booking> book=(List<Booking>) bookingRepository.findAll();
		return (User) book.stream().filter(s->s.getUser().getId().equals(id)).map(s->s.getId()).collect(Collectors.toList());
	}

	@Override
	public Homestay findByHomeStayId(Long id) {
		// TODO Auto-generated method stub
		List<Booking> book=(List<Booking>) bookingRepository.findAll();
		return  (Homestay)book.stream().filter(s->s.getHomestay().getId().equals(id)).map(s->s.getId()).collect(Collectors.toList());
	}

	@Override
	public List<Booking> getByOwner(Long ownerId) {
		return bookingRepository.findByUserId(ownerId);
	}
}
	
	
	
	

	

	


