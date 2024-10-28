package com.devstudios.portfolio.portfolio_backend.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devstudios.portfolio.portfolio_backend.application.dtos.coment.CreateComent;
import com.devstudios.portfolio.portfolio_backend.application.dtos.pagination.PaginationDto;
import com.devstudios.portfolio.portfolio_backend.application.dtos.response.ResponseDto;
import com.devstudios.portfolio.portfolio_backend.application.interfaces.repositories.IComentRepository;
import com.devstudios.portfolio.portfolio_backend.domain.entities.ComentEntity;



@Service
public class ComentService {

    @Autowired
    private IComentRepository comentRepository;


    public ResponseDto<ComentEntity> addComent( CreateComent coment ){
        ComentEntity newComent = new ComentEntity();

        newComent.setContent(coment.getContent());
        newComent.setEmail(coment.getEmail());
        newComent.setStars(coment.getStars());
        newComent.setUsername(coment.getUsername());

        ComentEntity comentDb = comentRepository.save(newComent);

        return new ResponseDto<>(comentDb, "Already save", 201);
    }

    public ResponseDto<List<ComentEntity>> findAll( PaginationDto paginationDto ){
        return new ResponseDto<>(comentRepository.findAll(), "All coments", 200);
    }

}
