package com.unipe.pos.sumula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unipe.pos.sumula.domain.Partida;
import com.unipe.pos.sumula.service.PartidaService;
@RestController
public class PartidaController {

	private final PartidaService partidaService;
	
	@Autowired
	public PartidaController(final PartidaService partidaService) {
		this.partidaService = partidaService;
	}
	
	
	@RequestMapping(value="/partida", method = RequestMethod.GET)
	public ResponseEntity< List<Partida> > listAllPartidas() {
		return new ResponseEntity< List<Partida> >
		(partidaService.listAllPartidas(), HttpStatus.OK);
	}

	@RequestMapping(value = "/partida/{id}",method = RequestMethod.GET)
	public ResponseEntity<Partida> getPartida(@PathVariable Long id) {
		
		Partida partida = partidaService.getById(id);
		
		return partida == null ? 
				new ResponseEntity<Partida>(HttpStatus.NOT_FOUND) : 
					new ResponseEntity<Partida>(partida, HttpStatus.OK);
	}
	
	@RequestMapping(value="/partida", method = RequestMethod.POST)
	public ResponseEntity<String> createPartida(@RequestBody Partida partida) {

		try {
			partidaService.save(partida);
			return new ResponseEntity<String>(HttpStatus.CREATED);

		 } catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public PartidaService getPartidaService() {
		return partidaService;
	}
	
	
	
}
