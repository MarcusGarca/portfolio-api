package com.portfolioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolioapi.model.Visitante;

public interface VisitanteRepository extends JpaRepository<Visitante, Integer> {

}
