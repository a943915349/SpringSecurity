package com.wisdom.demo.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wisdom
 */
@Controller
public class IndexController {

    @RequestMapping(value="/login")
    public String login()  {
        return "login";
    }

    @RequestMapping(value="/index")
    public String index()  {
        return "index";
    }

    @RequestMapping(value="/login-error")
    public String loginError(String error)  {
        String i = "1";
        if(i.equals(error)){
            return  "login-error1";
        }
        return "login-error2";
    }

    @RequestMapping("/404")
    public String to404()  {
        return "404";
    }
    @RequestMapping("/403")
    public String to403()  {
        return "403";
    }
    @RequestMapping("/500")
    public String to500()  {
        return "500";
    }

}
