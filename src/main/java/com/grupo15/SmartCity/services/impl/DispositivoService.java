package com.grupo15.SmartCity.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grupo15.SmartCity.entities.Dispositivo;
import com.grupo15.SmartCity.models.DispositivoModel;
import com.grupo15.SmartCity.repositories.IDispositivoRepository;
import com.grupo15.SmartCity.services.IDispositivoService;

@Service("dispositivoService")
public class DispositivoService implements IDispositivoService{
		
	@Autowired
	@Qualifier("dispositivoRepository")
	private IDispositivoRepository dispositivoRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<Dispositivo> getAll() {
		// TODO Auto-generated method stub
		return dispositivoRepository.findAll();
	}

	@Override
	public DispositivoModel alta(Dispositivo dispositivo) {
		// TODO Auto-generated method stub
		Dispositivo nuevo = dispositivoRepository.save(dispositivo);
		return modelMapper.map(nuevo, DispositivoModel.class);
	}

	@Override
	public DispositivoModel baja(DispositivoModel dispositivoModel) {
		// TODO Auto-generated method stub
		dispositivoModel.setActivo(false);
		Dispositivo dispositivo = dispositivoRepository.save(modelMapper.map(dispositivoModel, Dispositivo.class));
		return modelMapper.map(dispositivo, DispositivoModel.class);
	}

}
