package com.portfolioapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Comentario {
		@Column(name = "descricao_comentario")
		private String descriçao;
		@Column(name = "data_comentario")
		private LocalDateTime dataComentario;
		
		
		public String getDescriçao() {
			return descriçao;
		}
		public void setDescriçao(String descriçao) {
			this.descriçao = descriçao;
		}
		public LocalDateTime getDataComentario() {
			return dataComentario;
		}
		public void setDataComentario(LocalDateTime dataComentario) {
			this.dataComentario = dataComentario;
		}
		

}
