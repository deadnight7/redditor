package com.cpandit.springit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    //@RequestMapping ("/") // By default get
    //@RequestMapping (path = "/" , method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    @GetMapping("/")
    public String home (){
        return "index";
    }
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


