package mum.edu.leafhomestay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.leafhomestay.service.BookingService;

@Controller
public class BookingController {
	@Autowired
	BookingService bookingService;
	@RequestMapping(value="/Book_form", method=RequestMethod.GET)
	
	public String getBookingForm() {
		return "BookingForm";
	}

}
