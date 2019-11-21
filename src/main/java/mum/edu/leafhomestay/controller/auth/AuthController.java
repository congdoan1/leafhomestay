package mum.edu.leafhomestay.controller.auth;

import mum.edu.leafhomestay.domain.Role;
import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("/login")
public class AuthController {

    @Autowired
    UserService service;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @RequestMapping(value = {"","/","/login"}, method = RequestMethod.GET)
    public String getSignInPage() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getSignUpPage(@ModelAttribute("User") User user) {
        return "auth/SignUp";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addNewUser(@Valid @ModelAttribute("User") User user, BindingResult bindingResult, Model model) {

        User userExists = service.getUserByEmail(user.getEmail());
        if(userExists != null){
            bindingResult.rejectValue("email","error.email","Email address is already in use");
        }

        if(!user.getPassword().equals(user.getMatchingPassword())){
            bindingResult.rejectValue("matchingPassword","error.matchinPassing","Passwords does not match");
        }

        if (bindingResult.hasErrors()) {
            System.out.println("binding error");
            return "auth/SignUp";
        }

        Long selectedRole = Long.valueOf(user.getSelectedRole());
        Role userRole = service.getRoleById(selectedRole);

        user.getRoles().add(userRole);
        user.setStatus(1);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        // user.setMatchingPassword(passwordEncoder.encode(user.getMatchingPassword()));

        service.addUser(user);
        return "login";
    }

    @RequestMapping(value = "/failed", method = RequestMethod.GET)
    public String LoginFailed(Model model) {
        model.addAttribute("error","true");

        System.out.println("Failed");

        return "login";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String AccessDenied(Model model) {
        return "accessDenied";
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(Model model) {
        return "redirect:/home";
    }



}
