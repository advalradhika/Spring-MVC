package com.udemy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/test")
	public String showHome() {
		return "main-menu";
	}
	
}
