package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo.controller.HomeController;

@SpringBootApplication
public class DemoDi2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoDi2Application.class, args);
		HomeController homeController = ctx.getBean(HomeController.class);
		homeController.execute();
		
		// lookup 방식으로 사용 // Bean을 DL(lookup)해 생성가능..
		// 바로 생성자에 생성할때는 끝난다면 상관없지만 
		// 우선순위가 겹치거나 결국 실행이 겹친다면 시간이 더 걸릴 수 있다..
		// 시간차가 생겨 생성이 안될수도 있다?
//		AbstractApplicationContext ctx 
	}

}
