package com.grupo15.SmartCity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView("login");
		return mAV;
	}
	
	@GetMapping("/listado-dispositivos")
	public ModelAndView listadoDispositivos() {
		ModelAndView mAV = new ModelAndView("listadoDispositivos");
		return mAV;
	}
	
	@GetMapping("/listado-eventos")
	public ModelAndView listadoEventos() {
		ModelAndView mAV = new ModelAndView("listadoEventos");
		return mAV;
	}
	
	@GetMapping("/alta-dispositivo")
	public ModelAndView altaDispositivo() {
		ModelAndView mAV = new ModelAndView("altaDispositivo");
		return mAV;
	}
	
	@GetMapping("/registrar-evento")
	public ModelAndView registrarEvento() {
		ModelAndView mAV = new ModelAndView("registrarEvento");
		return mAV;
	}
	
	
	
}
