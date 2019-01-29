package com.cpandit.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home (Model model){
        model.addAttribute("title", "Hello Thymeleaf...!");
        return "home_First_Hello_Thymeleaf";
    }

    //@RequestMapping ("/") // By default get
    //@RequestMapping (path = "/" , method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
//    @GetMapping("/")
//    public String home (){
//        return "index";
//    }
}

//
//@RestController
//public class HomeController {
//
//    @RequestMapping("/")
//    public String home (){
//        return "Hello World VVV..!";
//    }
//
//}




