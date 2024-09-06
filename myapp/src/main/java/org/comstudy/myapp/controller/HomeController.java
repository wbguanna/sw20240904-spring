package org.comstudy.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.annotation.WebServlet;

@Controller
//@WebServlet("/home")
public class HomeController {

	@GetMapping("home")
	public String home(Model model) {
		model.addAttribute("message","Hello to my Spring Home");
		return "home";
	}
	
	@GetMapping("info")
	public String info() {
		return "info";
	}
}
