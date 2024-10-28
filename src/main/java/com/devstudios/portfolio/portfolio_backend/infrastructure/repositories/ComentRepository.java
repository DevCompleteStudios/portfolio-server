package com.devstudios.portfolio.portfolio_backend.infrastructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devstudios.portfolio.portfolio_backend.application.interfaces.repositories.IComentRepository;
import com.devstudios.portfolio.portfolio_backend.domain.entities.ComentEntity;



@Repository
public class ComentRepository implements IComentRepository {


    @Autowired
    ComentRepositoryJpa repositoryJpa;


    @Override
    public ComentEntity save(ComentEntity coment) {
        return repositoryJpa.save(coment);
    }

    @Override
    public List<ComentEntity> findAll() {
        return repositoryJpa.findAll();
    }
}
