package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.dto.Search;
import mum.edu.leafhomestay.service.HomestayService;
import mum.edu.leafhomestay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDate;

@Controller
@RequestMapping("/homestays")
public class HomestayController {

    @Autowired
    private HomestayService homestayService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{homestayId}", method = RequestMethod.GET)
    public String homestayDetails(@ModelAttribute("search") Search search,
                                  @PathVariable("homestayId") Long homestayId,
                                  Model model) {

        Homestay homestay = homestayService.getHomestayById(homestayId);

        model.addAttribute("homestay", homestay);

        return "homestay/homestayDetails";
    }

    @RequestMapping(value = "/wishlist", method = RequestMethod.GET)
    public String wishlist(Principal principal, Model model) {

        User user = userService.getUserByEmail(principal.getName());

        model.addAttribute("wistlist", homestayService.getWishlist(principal.getName()));

        return "homestay/wishlist";
    }
}
