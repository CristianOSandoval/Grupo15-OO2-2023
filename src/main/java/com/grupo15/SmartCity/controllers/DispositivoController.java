package com.grupo15.SmartCity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo15.SmartCity.services.IDispositivoService;

@Controller
@RequestMapping("/dispositivos")
public class DispositivoController {

	@Autowired
	@Qualifier("dispositivoService")
	private IDispositivoService dispositivoService;
	
	@PostMapping("/alta-dispositivo")
	public ModelAndView altaDispositivo() {
		ModelAndView mAV = new ModelAndView("altaDispositivo");
		return mAV;
	}
	
	@GetMapping("/listado-dispositivos")
	public ModelAndView listadoDispositivos() {
		ModelAndView mAV = new ModelAndView("listadoDispositivos");
		return mAV;
	}
	
}
