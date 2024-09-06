package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.GreetingService;

@Controller
public class HomeController {
	// DI는 생성자를 이용한 DI, setter를 이용한 DI로 2가지 방식이 있다..
	// 상속받았으니 같은 타입으로 묶인다.. (전략패턴)
	
	@Autowired
	@Qualifier("greetingKor")
	private GreetingService service;
	
	// 생성자를 이용한 DI
	public HomeController(GreetingService greetingService) {
		this.service = greetingService;
		System.out.println("##### HomeController 생성자");
		
		execute();
	}

	public void execute() {
		service.sayHello();
	}
	
	@GetMapping("/home")
	public void home(Model model) {
		model.addAttribute("greet", service.getGreeting());
	}
}
