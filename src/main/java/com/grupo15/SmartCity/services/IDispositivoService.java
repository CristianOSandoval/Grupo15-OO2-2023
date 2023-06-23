package com.grupo15.SmartCity.services;

import java.util.List;

import com.grupo15.SmartCity.entities.Dispositivo;
import com.grupo15.SmartCity.models.DispositivoModel;

public interface IDispositivoService {
	
	public List<Dispositivo> getAll();
	
	public DispositivoModel alta(Dispositivo dispositivo);
	
	public DispositivoModel baja(DispositivoModel dispositivoModel);
	
}
