package com.portfolioapi.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolioapi.dto.NovoVisitante;
import com.portfolioapi.model.Comentario;
import com.portfolioapi.model.Visitante;
import com.portfolioapi.repository.VisitanteRepository;

@Service
public class VisitanteService {
	@Autowired
	private VisitanteRepository repository;
	
	public void save(NovoVisitante novoVisitante) {
		Visitante visitante = new Visitante();
		visitante.setNome(novoVisitante.getNome());
		visitante.setProfissao(novoVisitante.getProfissao());
		visitante.setComentario(novoVisitante.getComentario());
		
		
		Comentario comentario = new Comentario();
		comentario.setDataComentario(LocalDateTime.now());
		
		
		
		repository.save(visitante);
		
	}
}
