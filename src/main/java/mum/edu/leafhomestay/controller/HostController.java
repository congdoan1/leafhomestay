package mum.edu.leafhomestay.controller;

import mum.edu.leafhomestay.domain.*;
import mum.edu.leafhomestay.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;
import javax.validation.Valid;
import java.io.File;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/host")
public class HostController {
    @Autowired
    HomestayService homestayService;

    @Autowired
    HomestayTypeService homestayTypeService;

    @Autowired
    BedTypeService bedTypeService;

    @Autowired
    AmenityService amenityService;

    @Autowired
    ServletContext servletContext;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/homestays", method = RequestMethod.GET)
    public String dashboard(Principal principal, Model model) {

        User user = userService.getUserByEmail(principal.getName());

        List<Homestay> homestayList = homestayService.getByOwnerId(user.getId());
        model.addAttribute("homestayList", homestayList);

        return "host/dashboard";
    }

    private void initData(Model model) {
        List<BedType> bedTypeList = bedTypeService.findAll();
        List<HomestayType> homestayTypeList = homestayTypeService.findAll();
        List<Amenity> amenityList = amenityService.findAll();

        model.addAttribute("bedTypeList", bedTypeList);
        model.addAttribute("homestayTypeList", homestayTypeList);
        model.addAttribute("amenityList", amenityList);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String inputNewHomeStay(@ModelAttribute("newHomestay") Homestay newHomestay, Model model) {
        initData(model);
        return "host/addHomestay";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNewHomeStay(Principal principal,
                                 @Valid @ModelAttribute("newHomestay") Homestay newHomestay,
                                 BindingResult result,
                                 Model model,
                                 RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            initData(model);
            return "host/addHomestay";
        }

        MultipartFile imageData = newHomestay.getCoverImageData();
        // input file name WITH extension

//        Media newImage = null;
//        //isEmpty means file exists BUT NO Content
        if (imageData != null && !imageData.isEmpty()) {
            try {
                String rootDirectory = servletContext.getRealPath("/");
                String fileName = rootDirectory + "/resources/images/" + imageData.getOriginalFilename();
                newHomestay.setCoverImage(imageData.getOriginalFilename());
                imageData.transferTo(new File(fileName));
            } catch (Exception e) {
                throw new RuntimeException(" Image saving failed", e);
            }
        }

        newHomestay.getAddress().setHomestay(newHomestay);
        newHomestay.setOwner(userService.getUserByEmail(principal.getName()));
        homestayService.addHomeStay(newHomestay);
        redirectAttributes.addFlashAttribute("homestay", newHomestay);
        return "redirect:/host/detail";
    }

    Media createCoverImageObj(MultipartFile file) {
        String rootDirectory = servletContext.getRealPath("/");
        Media newMedia = new Media();
        newMedia.setName(file.getOriginalFilename());
        newMedia.setUrl(rootDirectory + file.getOriginalFilename());

        return newMedia;
    }

    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public String detailHomeStay(Model model) {

        return "host/homestayDetail";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editHomestay(@PathVariable("id") long id, @ModelAttribute Homestay editHomestay, Model model) {

        initData(model);
        editHomestay = homestayService.getHomestayById(id);
        model.addAttribute("editHomestay", editHomestay);

        return "host/editHomestay";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateHomestay(@PathVariable("id") long id, @Valid @ModelAttribute("editHomestay") Homestay editHomestay
            , BindingResult result, Model model, RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            initData(model);
            return "host/addHomestay";
        }
        MultipartFile imageData = editHomestay.getCoverImageData();
        // input file name WITH extension

//        Media newImage = null;
//        //isEmpty means file exists BUT NO Content
        if (imageData != null && !imageData.isEmpty()) {
            try {
                String rootDirectory = servletContext.getRealPath("/");
                String fileName = rootDirectory + "\\resources\\images\\" + imageData.getOriginalFilename();
                editHomestay.setCoverImage(imageData.getOriginalFilename());
                imageData.transferTo(new File(fileName));
            } catch (Exception e) {
                throw new RuntimeException(" Image saving failed", e);
            }
        }

        editHomestay.setAddress(editHomestay.getAddress());
        homestayService.addHomeStay(editHomestay);

        redirectAttributes.addFlashAttribute("homestay", editHomestay);
        return "redirect:/host/detail";

    }
}