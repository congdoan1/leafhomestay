package mum.edu.leafhomestay.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.leafhomestay.domain.Booking;
import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.Payment;
import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.service.BookingService;

@Controller
public class BookingController {
	@Autowired
	BookingService bookingService;
	@RequestMapping(value="/Book_form", method=RequestMethod.GET)
	
	public String getBookingForm() {
		return "BookingForm";
	}

@RequestMapping(value="/Book_form", method=RequestMethod.POST)
	
	public String saveBookingForm(@Valid@ModelAttribute("book")Booking booking,BindingResult result,RedirectAttributes redirect,Long id) {
	
		if(result.hasErrors()) {
			
			 return "PaymentForm"; 
			
		}
		User usr=bookingService.findByUserId(id);
		Homestay hty=bookingService.findByHomeStayId(id);
		booking.setHomestay(hty);
		booking.setUser(usr);
		bookingService.saveUserBooking(booking);
		redirect.addFlashAttribute(booking);
		
		return "redirect:/payment/paymentform";
	}

}


