package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("greetingEng")
public class GreetingServiceEng implements GreetingService{

	public GreetingServiceEng() {
		System.out.println(">>> GreetingServiceEng constructor");
	}
	
	@Override
	public void sayHello() {
		System.out.println(">>> Hello World");
		
	}
}
