package org.comstudy.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("message", "JSP~~ 야 안녕하니?");
		return "home";
	}
}
