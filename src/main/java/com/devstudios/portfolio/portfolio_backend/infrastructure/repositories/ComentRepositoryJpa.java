package com.devstudios.portfolio.portfolio_backend.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudios.portfolio.portfolio_backend.domain.entities.ComentEntity;




public interface ComentRepositoryJpa extends JpaRepository<ComentEntity, Long> {}
