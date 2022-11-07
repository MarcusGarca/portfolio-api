package com.portfolioapi.model;

import java.time.LocalDateTime;

public class Comentario {
		
		private String descriçao;
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
