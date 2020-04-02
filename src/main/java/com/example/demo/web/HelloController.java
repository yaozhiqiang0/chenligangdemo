package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/index", method=RequestMethod.GET)
    public String index(ModelMap map){

        map.addAttribute("host","http://blog.didisplay.com");
        return "index";
    }
    @PostMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/security")
    public String security(ModelMap map){

        map.addAttribute("host","http://blog.didisplay.com");
        return "security";
    }

    @RequestMapping(value="/login",method=RequestMethod.GET)
    /*@RequestMapping("/login")*/
    public String login(){
        return "login";
    }


}
