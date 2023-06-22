package com.grupo15.SmartCity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class SmartCityController {
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView("index");
		return mAV;
	}
	
	@GetMapping("/Menu")
	public ModelAndView menu() {
		ModelAndView mAV = new ModelAndView("menu");
		return mAV;
	}
	

	
	@GetMapping("/Registro")
	public ModelAndView registro() {
		ModelAndView mAV = new ModelAndView("registro");
		return mAV;
	}
	

	
}
