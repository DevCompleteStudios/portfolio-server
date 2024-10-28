package com.devstudios.portfolio.portfolio_backend.application.interfaces.repositories;

import java.util.List;

import com.devstudios.portfolio.portfolio_backend.domain.entities.ComentEntity;





public interface IComentRepository {

    public ComentEntity save( ComentEntity coment );
    public List<ComentEntity> findAll();

}
