package com.devstudios.portfolio.portfolio_backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devstudios.portfolio.portfolio_backend.application.dtos.coment.ComentDto;
import com.devstudios.portfolio.portfolio_backend.application.dtos.coment.CreateComent;
import com.devstudios.portfolio.portfolio_backend.application.dtos.pagination.PaginationDto;
import com.devstudios.portfolio.portfolio_backend.application.dtos.response.ResponseDto;
import com.devstudios.portfolio.portfolio_backend.application.services.ComentService;
import com.devstudios.portfolio.portfolio_backend.domain.entities.ComentEntity;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/coments")
public class ComentController {

    @Autowired
    ComentService service;


    @PostMapping("/add-coment")
    public ResponseEntity<ResponseDto<ComentEntity>> addComent( @Valid @RequestBody CreateComent coment ){
        var res = service.addComent(coment);
        return ResponseEntity.status(res.getStatus()).body(res);
    }

    @GetMapping("/find-all")
    public ResponseEntity<ResponseDto<List<ComentDto>>> findAll( @Valid PaginationDto paginationDto ){
        var res = service.findAll(paginationDto);
        return ResponseEntity.status(res.getStatus()).body(res);
    }

}
