package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.dto.Search;
import mum.edu.leafhomestay.service.HomestayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/homestays")
public class HomestayController {

    @Autowired
    private HomestayService homestayService;

    @RequestMapping(value = "/{homestayId}", method = RequestMethod.GET)
    public String homestayDetails(@ModelAttribute("booking") Search search,
                                  @PathVariable("homestayId") Long homestayId,
                                  Model model) {

        Homestay homestay = homestayService.getHomestayById(homestayId);

        model.addAttribute("homestay", homestay);

        return "homestay/homestayDetails";
    }
}
