package com.example.AutowiredDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiredDependencyInjectionApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(AutowiredDependencyInjectionApplication.class, args);
	
	Student s = context.getBean(Student.class);	
	s.show();

	}

}
