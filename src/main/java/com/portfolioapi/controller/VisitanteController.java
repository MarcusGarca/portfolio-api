package com.portfolioapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolioapi.dto.NovoVisitante;
import com.portfolioapi.model.Visitante;
import com.portfolioapi.repository.VisitanteRepository;
import com.portfolioapi.service.VisitanteService;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {
	
	@Autowired
	private VisitanteRepository repository;
	
	@Autowired
	private VisitanteService service;
	
	@GetMapping
	public List <Visitante> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovoVisitante visitante) {
		service.save(visitante);
	}

}
