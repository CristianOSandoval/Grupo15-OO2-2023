package com.grupo15.SmartCity.controllers;

<<<<<<< Updated upstream
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
=======
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping(value = "/login", produces = "text/html")
	public String loginPage(@RequestParam(value = "error", required = false) String error,
	        @RequestParam(value = "logout", required = false) String logout, Model model) {
	    if (error != null) {
	        model.addAttribute("error", true);
	    }
	    if (logout != null) {
	        model.addAttribute("logout", true);
	    }
	    return "login";
	}

	@GetMapping("/home")
	public String showHomePage() {
		return "home";
	}
}
>>>>>>> Stashed changes
