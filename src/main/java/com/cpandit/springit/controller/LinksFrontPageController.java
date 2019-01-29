package com.cpandit.springit.controller;

import com.cpandit.springit.repository.LinkRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LinksFrontPageController {

    LinkRepository linkRepository;

    public LinksFrontPageController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping ("/all_links")
    public String foo (Model model) {
        //model.addAttribute("pageTitle", "This is our page foo..!");
        model.addAttribute("links", linkRepository.findAll());

        return "alllinks";
    }

}
