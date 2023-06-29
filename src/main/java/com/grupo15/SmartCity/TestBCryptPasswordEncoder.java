package com.grupo15.SmartCity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TestBCryptPasswordEncoder implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	public static void main(String[] args) {
		
		SpringApplication.run(TestBCryptPasswordEncoder.class, args);
	}
	
	public void run(String... args) throws Exception
	{
		String pass1 = "auditor";
		String pass2 = "admin";
		
		System.out.println(passEncoder.encode(pass1));
		System.out.println(passEncoder.encode(pass2));
		
	}
	
}