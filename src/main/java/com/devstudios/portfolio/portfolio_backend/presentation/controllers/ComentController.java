package com.devstudios.portfolio.portfolio_backend.presentation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/coments")
public class ComentController {

    public String addComent(){
        return "add coment";
    }

    public String preAddComent(){
        return "pre add coment";
    }

    public String findAll(){
        return "find-all";
    }

}
