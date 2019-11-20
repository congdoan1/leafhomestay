package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.Amenity;
import mum.edu.leafhomestay.domain.BedType;
import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.domain.HomestayType;
import mum.edu.leafhomestay.service.AmenityService;
import mum.edu.leafhomestay.service.BedTypeService;
import mum.edu.leafhomestay.service.HomestayTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import mum.edu.leafhomestay.service.HomestayService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/host")
public class HostController {
    @Autowired
    HomestayService homeStayService;

    @Autowired
    HomestayTypeService homestayTypeService;

    @Autowired
    BedTypeService bedTypeService;

    @Autowired
    AmenityService amenityService;

    @RequestMapping(method = RequestMethod.GET)
    public String dashboard(Model model) {

        return "host/dashboard";
    }

    @RequestMapping(value = "addhomestay", method = RequestMethod.GET)
    public String inputNewHomeStay(@ModelAttribute Homestay homestay, Model model) {

        List<BedType> bedTypeList = bedTypeService.findAll();
        List<HomestayType> homestayTypeList = homestayTypeService.findAll();
        List<Amenity> amenityList = amenityService.findAll();

        model.addAttribute("bedTypeList", bedTypeList);
        model.addAttribute("homestayTypeList", homestayTypeList);
        model.addAttribute("amenityList", amenityList);
        return "host/addHomestay";
    }


    @RequestMapping(value = "addhomestay", method = RequestMethod.POST)
    public String addNewHomeStay(@ModelAttribute Homestay homestay, Model model) {


        return "redirect:/detaihomestay";


    }


    @RequestMapping(value = "detaihomestay", method = RequestMethod.GET)
    public String detailHomeStay(Model model) {

        return "host/homestayDetail";

    }
}