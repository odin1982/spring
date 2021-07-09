package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/user/list")
	public String userList(Model model) {
		model.addAttribute("nbUsers", 10);
		return "user/list";
	}
}
