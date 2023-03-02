package com.example.firstProg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProgApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProgApplication.class, args);
		
		System.out.println("This is my first Spring boot program");
	}

}
