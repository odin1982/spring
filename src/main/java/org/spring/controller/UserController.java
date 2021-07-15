package org.spring.controller;


import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger log = Logger.getLogger(UserController.class.getName());
	@RequestMapping("/list")
	public String userList(Model model) {
		model.addAttribute("nbUsers", 10);
		return "user/list";//Ubicación de JSP
	}
	
	@RequestMapping("/{id}/{field}")//Dynamic Parameters
	public String showUserField(@PathVariable("id")Long userId, @PathVariable("field")String field) {
		log.info("In showUserField..."+userId + " " + field);
		return "user/list";
	}
	
	@RequestMapping("/listTiles")
	public String userListTiles(Model model) {
		model.addAttribute("nbUsers", 10);
		return "home";//Ubicación de JSP
	}
	
	@RequestMapping("/listTiles2")
	public String userListTiles2(Model model) {
		model.addAttribute("nbUsers", 10);
		return "user/add";//Ubicación de JSP
	}
	
	
}
