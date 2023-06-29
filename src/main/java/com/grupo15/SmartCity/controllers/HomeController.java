package com.grupo15.SmartCity.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    private Logger logger = LoggerFactory.getLogger(HomeController.class);
    

    @RequestMapping("/home")
    public String homePage() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        logger.debug("Debug message: User '{}' logged in successfully.", username);
        logger.info("Info message: User '{}' logged in successfully.", username);
        logger.warn("Warning message: User '{}' logged in successfully.", username);
        logger.error("Error message: User '{}' logged in successfully.", username);
        return "home";
    }
    
    // ...
}
