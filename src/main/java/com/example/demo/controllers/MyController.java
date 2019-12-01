package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@Value("usernameUsingProperty")
	public String usernameUsingProperty;
	@RequestMapping("/")
	public String getMsg(Model model) {
//		model.addAttribute("username", "Archana");
		model.addAttribute("username", usernameUsingProperty);
		model.addAttribute("useremail", "archan2gmail.com");
		return "test";
	}
	

}
