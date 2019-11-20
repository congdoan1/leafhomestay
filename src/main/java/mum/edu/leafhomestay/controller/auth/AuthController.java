package mum.edu.leafhomestay.controller.auth;

import mum.edu.leafhomestay.domain.Role;
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
import java.util.Map;

@Controller
@RequestMapping("/login")
public class AuthController {

    @Autowired
    UserService service;

    @RequestMapping(value={"","/","login"}, method = RequestMethod.GET)
    public String getSignInPage(){

        System.out.println("Login GET is working!");

        return "login";
    }

    @RequestMapping(value = "/failed", method = RequestMethod.GET)
    public String LoginFailed(Model model){

        //model.addAttribute("error","true");
        System.out.println("Fail is working!");

        return "login";
    }

    @RequestMapping(value = "/failed", method = RequestMethod.POST)
    public String LoginFailedPost(Model model){

        //model.addAttribute("error","true");
        System.out.println("Fail POST is working!");

        return "login";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String AccessDenied(Model model){

        System.out.println("accessDenied GET request");

        return "accessDenied";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.POST)
    public String AccessDeniedPost(Model model){

        System.out.println("accessDenied GET request");

        return "accessDenied";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getSignUpPage(@ModelAttribute("User") User user ){

        return "auth/SignUp";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addNewUser(@Valid @ModelAttribute("User") User user, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "auth/SignUp";
        }

        Role newUserRole = new Role();
        newUserRole.setEmail(user.getEmail());
        newUserRole.setAuthority(user.getSelectedRole());
        user.getRoles().add(newUserRole);
        user.setEnabled(1);

        service.addUser(user);

        //user = createUserAccount(user, bindingResult);
        //if (user == null) {
        //    bindingResult.rejectValue("email", "Email is already in use");
        //}
        return "/login";
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
