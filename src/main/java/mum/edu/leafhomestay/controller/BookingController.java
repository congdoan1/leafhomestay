package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.Booking;
import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.service.BookingService;
import mum.edu.leafhomestay.service.HomestayService;
import mum.edu.leafhomestay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private HomestayService homestayService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/homestays/{homestayId}/booking", method = RequestMethod.GET)
    public String getBookingForm(@PathVariable("homestayId") Long homestayId,
                                 @ModelAttribute("booking") Booking booking,
                                 Model model) {

        Homestay homestay = homestayService.getHomestayById(homestayId);
        booking.setHomestay(homestay);
        model.addAttribute("booking", booking);

        return "/BookingForm";
    }

    @RequestMapping(value = "/homestays/{homestayId}/booking", method = RequestMethod.POST)
    public String saveBookingForm(Principal principal,
                                  @PathVariable("homestayId") Long homestayId,
                                  @Valid @ModelAttribute("booking") Booking booking,
                                  BindingResult result,
                                  Model model,
                                  RedirectAttributes redirectAttributes) {
        Homestay homestay = homestayService.getHomestayById(homestayId);
        booking.setHomestay(homestay);

        if (result.hasErrors()) {
            model.addAttribute("booking", booking);

            return "/BookingForm";
        }

        User user = userService.getUserByEmail(principal.getName());
        booking.setUser(user);

        booking.setTotalPrice(booking.getTotalPrice());
        bookingService.saveUserBooking(booking);
        redirectAttributes.addFlashAttribute("booking", booking);

        return "redirect:/payment/paymentform";
    }

}


