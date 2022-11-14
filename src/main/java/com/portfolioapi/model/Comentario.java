package com.portfolioapi.model;
import com.fasterxml.jackson.annotation.JsonFormat;

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
		
		
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
		public LocalDateTime getDataComentario() {
			return dataComentario;
		}
		public void setDataComentario(LocalDateTime dataComentario) {
			this.dataComentario = dataComentario;
		}
		

}
