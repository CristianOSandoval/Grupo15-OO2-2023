package com.grupo15.SmartCity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupo15.SmartCity.models.Usuario;
import com.grupo15.SmartCity.repositories.UsuarioRepository;

@RestController
public class LoginController {

	@Autowired
	private UsuarioRepository userRepository;

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		// Verifica las credenciales
		Usuario user = userRepository.findByUsuario(username);
		if (user != null && user.getContraseña().equals(password)) {

			return "redirect:/dashboard";
		} else {

			model.addAttribute("error", "Credenciales inválidas");
			return "login";
		}
	}
}
