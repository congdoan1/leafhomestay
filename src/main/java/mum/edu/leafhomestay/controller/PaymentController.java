package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.Booking;
import mum.edu.leafhomestay.domain.Payment;
import mum.edu.leafhomestay.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/paymentform", method = RequestMethod.GET)
    public String getPaymentForm(@ModelAttribute("payment") Payment payment, Model model) {

        Booking booking = (Booking) model.asMap().get("booking");

        payment.setBooking(booking);
        payment.setDate(LocalDate.now());
        payment.setTotalAmount(booking.getTotalPrice());

        return "/PaymentForm";
    }

    @RequestMapping(value = "/paymentform", method = RequestMethod.POST)
    public String savePaymentForm(@Valid @ModelAttribute("payment") Payment payment,
                                  BindingResult result,
                                  RedirectAttributes redirectAttributes,
                                  Model model) {

        if (result.hasErrors()) {

            return "/PaymentForm";
        }

        payment.setPaymentDate(LocalDateTime.now());
        paymentService.savePayment(payment);

        redirectAttributes.addFlashAttribute("payment", payment);
        return "redirect:/payment/success";
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String paymentSuccess() {
        return "/paymentSuccess";
    }
}
