package com.portfolioapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Comentario {
		@Column(name = "descricao_comentario")
		private String descricao;
		@Column(name = "data_comentario")
		private LocalDateTime dataComentario;
		
		
		
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public LocalDateTime getDataComentario() {
			return dataComentario;
		}
		public void setDataComentario(LocalDateTime dataComentario) {
			this.dataComentario = dataComentario;
		}
		

}
