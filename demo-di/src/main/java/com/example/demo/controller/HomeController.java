package com.example.demo.controller;

import com.example.demo.service.GreetingService;

public class HomeController {
	// DI는 생성자를 이용한 DI, setter를 이용한 DI로 2가지 방식이 있다..
	// 상속받았으니 같은 타입으로 묶인다.. (전략패턴)
	
	private GreetingService service;
	
	public HomeController(GreetingService greetingService) {
		this.service = greetingService;
		System.out.println("##### HomeController 생성자");
		
		execute();
	}

	// 여기는 setter를 이용한 DI
	public void setService(GreetingService service) {
		this.service = service;
	}

	private void execute() {
		service.sayHello();
	}
}
