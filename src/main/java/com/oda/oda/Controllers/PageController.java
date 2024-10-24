package com.oda.oda.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    // for home page redirect
    @RequestMapping("/")
    public String index() {
        return "redirect:/home";
    }
    // for home page mapping
    @RequestMapping("/home")
    public String home(){
        return "home";
    }

 

    




}
