package mum.edu.leafhomestay.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	@RequestMapping(value="/paymentform", method=RequestMethod.POST)
	public void  savePaymentForm(@Valid@ModelAttribute("payment")Payment payment,BindingResult result,RedirectAttributes redirect) {
		if(result.hasErrors()) {
			
			/* return "PaymentForm"; */
			System.out.println("error");
		}
	//	redirect.addFlashAttribute("payments", )
		paymentService.savePayment(payment);
		
		
	}

}
