package com.grupo15.SmartCity.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grupo15.SmartCity.entities.Evento;
import com.grupo15.SmartCity.repositories.IEventoRepository;
import com.grupo15.SmartCity.services.IEventoService;

@Service("eventoService")
public class EventoService implements IEventoService{
	
	@Autowired
	@Qualifier("eventoRepository")
	private IEventoRepository eventoRepository;

	@Override
	public List<Evento> getAll() {
		// TODO Auto-generated method stub
		return eventoRepository.findAll();
	}
	
	@Override
	public List<Evento> getAllById(int id) {
		// TODO Auto-generated method stub
		return eventoRepository.findAllById(id);
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}
}
