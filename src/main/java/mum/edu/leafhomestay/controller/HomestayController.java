package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.Booking;
import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.service.HomestayService;
import mum.edu.leafhomestay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
@RequestMapping("/homestays")
public class HomestayController {

    @Autowired
    private HomestayService homestayService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{homestayId}", method = RequestMethod.GET)
    public String homestayDetails(HttpServletRequest request,
                                  @ModelAttribute("booking") Booking booking,
                                  @PathVariable("homestayId") Long homestayId,
                                  Model model) {

        Booking b = (Booking) request.getSession().getAttribute("booking");

        booking.setNumberOfGuest(b.getNumberOfGuest());
        booking.setCheckInDate(b.getCheckInDate());
        booking.setCheckOutDate(b.getCheckOutDate());

        Homestay homestay = homestayService.getHomestayById(homestayId);
        model.addAttribute("homestay", homestay);

        return "homestay/homestayDetails";
    }

    @RequestMapping(value = "/{homestayId}/book", method = RequestMethod.POST)
    public String book(@ModelAttribute("booking") Booking booking,
                       @PathVariable("homestayId") Long homestayId,
                       RedirectAttributes redirectAttributes) {

        redirectAttributes.addFlashAttribute("booking", booking);

        return "redirect:/homestays/" + homestayId + "/booking";
    }

    @RequestMapping(value = "/wishlist", method = RequestMethod.GET)
    public String wishlist(Principal principal, Model model) {

        User user = userService.getUserByEmail(principal.getName());

        model.addAttribute("wistlist", homestayService.getWishlist(principal.getName()));

        return "homestay/wishlist";
    }
}
