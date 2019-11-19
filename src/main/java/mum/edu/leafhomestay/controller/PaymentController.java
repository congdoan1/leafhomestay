package mum.edu.leafhomestay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.leafhomestay.domain.Payment;
import mum.edu.leafhomestay.service.PaymentService;

@Controller
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	@RequestMapping(value="/paymentform", method=RequestMethod.GET)
	
	public String  getPaymentForm() {
		return "PaymentForm";
	}

}
