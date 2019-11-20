package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.dto.Search;
import mum.edu.leafhomestay.repository.HomestayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HomestayRepository homestayRepository;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(@ModelAttribute("search") Search search) {
        return "/home";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam("location") String location,
                         @RequestParam("dateFrom") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dateFrom,
                         @RequestParam("dateTo") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dateTo,
                         @RequestParam("numberOfGuest") int numberOfGuest,
                         Model model) {

//        List<Homestay> homestays = homestayRepository.search(location, dateFrom, dateTo, numberOfGuest);
        List<Homestay> homestays = (List<Homestay>) homestayRepository.findAll();

        model.addAttribute("homestays", homestays);
        model.addAttribute("numberOfNights", dateFrom.until(dateTo, ChronoUnit.DAYS));

        return "/search";
    }

}
