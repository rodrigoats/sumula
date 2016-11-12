package com.unipe.pos.sumula.service;

import java.util.List;

import com.unipe.pos.sumula.domain.Partida;

public interface PartidaService {

	Partida save(Partida partida);

	Partida getById(Long id);
	
	List<Partida> listAllPartidas();
}

