package com.example.demo.service;

public interface GreetingService {
	void sayHello();
	default Object getGreeting() {
		return this;
	}
}
