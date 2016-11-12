package com.unipe.pos.sumula.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.unipe.pos.sumula.enumeration.TipoCartao;


@Entity
public class Cartao {

	@Id
	private Long id;
	
	private String nomeJogador;
	
	@Enumerated
	private TipoCartao tipoCartao;
	
	public Cartao(String nomeJogador, TipoCartao tipoCartao) {
		
		this.nomeJogador = nomeJogador;
		this.tipoCartao = tipoCartao;
	}

	public Cartao() {
	}

	public String getNomeJogador() {
		return nomeJogador;
	}
	
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	
	public TipoCartao getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(TipoCartao tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
