package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.User;

@Controller
public class UserController {

	@GetMapping("users")
	public String user(Model model) {
       model.addAttribute("users", getUserList());
		return "userList";
	}

	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1, "Archana", 957, "archana@gmail.com", "Pune"));
		userList.add(new User(2, "Pooja", 95791, "archana@gmail.com", "Pune"));
		userList.add(new User(3, "Shraddha", 9579139, "archana@gmail.com", "Pune"));
		return userList;

	}

}
