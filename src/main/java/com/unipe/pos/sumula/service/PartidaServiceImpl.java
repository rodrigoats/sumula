package com.unipe.pos.sumula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.unipe.pos.sumula.domain.Partida;
import com.unipe.pos.sumula.repository.PartidaRepository;

@Service
@Validated
public class PartidaServiceImpl implements PartidaService{

	
	private final PartidaRepository repository;
	
	@Autowired
    public PartidaServiceImpl(final PartidaRepository repository) {
        this.repository = repository;
    }
	
	@Override
	public Partida save(Partida partida) {
		return repository.save(partida);
	}

	@Override
	public List<Partida> listAllPartidas() {
		return repository.findAll();
	}

	@Override
	public Partida getById(Long id) {
		return repository.findOne(id);
	}

}
