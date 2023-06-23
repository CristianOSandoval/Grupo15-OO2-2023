package com.grupo15.SmartCity.services;

import java.util.List;

import com.grupo15.SmartCity.entities.Evento;

public interface IEventoService {
	
	public List<Evento> getAll();
	
	public boolean save();
}
