package org.spring.controller;

import org.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("hi")
	@ResponseBody
	public String hi() {
		return "Hello, world";
	}
	
	
	@RequestMapping("hiUsers")
	@ResponseBody
	public String hiUsers() {
		return "nb of users: " + userService.findNumberOfUsers();
	}
}
