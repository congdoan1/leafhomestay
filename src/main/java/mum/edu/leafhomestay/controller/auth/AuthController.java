package mum.edu.leafhomestay.controller.auth;

import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/Auth")
public class AuthController {

    @Autowired
    UserService service;

    @RequestMapping(value={"","/","SignIn"}, method = RequestMethod.GET)
    public String getSignInPage(){

        return "auth/SignIn";
    }

    @RequestMapping(value = "/SignUp", method = RequestMethod.GET)
    public String getSignUpPage(@ModelAttribute("User") User user ){

        return "auth/SignUp";
    }

    @RequestMapping(value = "/SignUp", method = RequestMethod.POST)
    public String addNewUser(@Valid @ModelAttribute("User") User user, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "auth/SignUp";
        }
        //service.register(user);

        //user = createUserAccount(user, bindingResult);
        //if (user == null) {
        //    bindingResult.rejectValue("email", "Email is already in use");
        //}
        return "home";
    }

    //private User createUserAccount(User user, BindingResult result) {
    //    User registered = null;
    //    try {
    //        registered = service.register(user);
    //    } catch (Exception e) {
    //        return null;
    //    }
    //    return registered;
    //}

}
