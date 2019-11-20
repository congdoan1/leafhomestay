package mum.edu.leafhomestay.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String getSignInPage() {

        return "auth/SignIn";
    }

    @RequestMapping(value = {"/signup"}, method = RequestMethod.GET)
    public String getSignUpPage() {

        return "auth/SignUp";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logout(Model model) {
        return "redirect:/home";
    }
}
