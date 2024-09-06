package com.example.demo.service;

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
