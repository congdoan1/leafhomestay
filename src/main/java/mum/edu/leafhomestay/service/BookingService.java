package mum.edu.leafhomestay.service;

import java.util.List;

import mum.edu.leafhomestay.domain.Booking;
import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.User;

public interface BookingService {
	public List<Booking> findAll();
	public void saveUserBooking(Booking newbook); 
	public User findByUserId(Long Id);
	public Homestay findByHomeStayId(Long Id);
	
}
