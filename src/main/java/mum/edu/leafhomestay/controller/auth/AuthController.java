package mum.edu.leafhomestay.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Auth")
public class AuthController {

    @RequestMapping(value={"","/","SignIn"}, method = RequestMethod.GET)
    public String getSignInPage(){

        return "auth/SignIn";
    }

}
