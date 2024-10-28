package com.devstudios.portfolio.portfolio_backend.presentation.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/contact")
public class ContactController {


    @PostMapping
    public String contact(){
        return "Contact";
    }

    @PostMapping("/support")
    public String support(){
        return "Support";
    }

}
