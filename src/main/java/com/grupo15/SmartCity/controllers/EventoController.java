package com.grupo15.SmartCity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo15.SmartCity.helpers.ViewRouteHelper;
import com.grupo15.SmartCity.services.IEventoService;

@Controller
@RequestMapping("/eventos")
public class EventoController {
	
	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;
	
	@GetMapping("/registrar-evento")
	public ModelAndView registrarEvento() {
		ModelAndView mAV = new ModelAndView("registrarEvento");
		return mAV;
	}
	
	@GetMapping("/listado-eventos")
	public ModelAndView listadoEventos() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LISTADOEVENTOS);
		mAV.addObject("eventosLista", eventoService.getAll());
		return mAV;
	}
	
	@GetMapping("/listado-eventos/{id}")
	public ModelAndView listadoEventosPorId(@PathVariable int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LISTADOEVENTOS);
		mAV.addObject("eventosLista", eventoService.getAllById(id));
		return mAV;
	}
}
