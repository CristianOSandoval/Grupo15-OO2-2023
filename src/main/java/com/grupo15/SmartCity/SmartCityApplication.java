package com.grupo15.SmartCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< Updated upstream
import org.springframework.context.annotation.ComponentScan;
=======
import org.springframework.boot.autoconfigure.domain.EntityScan;
>>>>>>> Stashed changes
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
<<<<<<< Updated upstream
@ComponentScan(basePackages = "com.grupo15.SmartCity")
=======
@EnableJpaRepositories(basePackages = "com.grupo15.SmartCity.repositories")
@EntityScan(basePackages = "com.grupo15.SmartCity.entities")
>>>>>>> Stashed changes
public class SmartCityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartCityApplication.class, args);
    }
}