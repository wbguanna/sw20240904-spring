package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class DemoDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDiApplication.class, args);
	}

}
