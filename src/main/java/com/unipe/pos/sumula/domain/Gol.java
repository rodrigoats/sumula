package com.unipe.pos.sumula.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gol {

	@Id
	private Long id;
	
	private String nomeJogador;
	
	private String horaGol;
	
	public Gol (String nomeJoador, String horaGol) {
		
		this.nomeJogador = nomeJoador;
		this.horaGol = horaGol;
	}
	
	public Gol () {
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public String getHoraGol() {
		return horaGol;
	}

	public void setHoraGol(String horaGol) {
		this.horaGol = horaGol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
