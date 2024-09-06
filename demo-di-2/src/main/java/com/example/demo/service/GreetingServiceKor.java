package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
@Qualifier("greetingKor")
public class GreetingServiceKor implements GreetingService{

	public GreetingServiceKor() {
		super();
		System.out.println(">>> GreetingServiceKor 생성자");
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("안녕세계!!");
	}
	
	

}
