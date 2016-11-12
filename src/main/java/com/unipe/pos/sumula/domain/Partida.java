package com.unipe.pos.sumula.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Partida {

	@Id
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Gol> gols;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Cartao> cartoes;
	
	private Date data;

	public Partida() {
	}
	
	public Partida(List<Gol> gols, List<Cartao> cartoes) {
		this.gols = gols;
		this.cartoes = cartoes;
	}

	public List<Gol> getGols() {
		return gols;
	}

	public void setGols(List<Gol> gols) {
		this.gols = gols;
	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
