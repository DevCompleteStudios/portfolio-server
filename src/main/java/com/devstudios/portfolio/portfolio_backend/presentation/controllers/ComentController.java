package com.devstudios.portfolio.portfolio_backend.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devstudios.portfolio.portfolio_backend.application.dtos.coment.CreateComent;
import com.devstudios.portfolio.portfolio_backend.application.dtos.pagination.PaginationDto;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/coments")
public class ComentController {

    @PostMapping("/add-coment")
    public Object addComent( @Valid @RequestBody CreateComent coment ){
        return coment;
    }

    @GetMapping("/find-all")
    public Object findAll( @Valid PaginationDto paginationDto ){
        return paginationDto;
    }

}
