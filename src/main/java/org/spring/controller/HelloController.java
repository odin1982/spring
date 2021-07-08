package org.spring.controller;

import org.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ApplicationContext context;

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
	
	//Using a bean directly
	@RequestMapping("bean-directly")
	@ResponseBody
	public String usingBeanDirectly() {
		UserService bean = (UserService)context.getBean("userService");
		//another way to get a bean by its class
		//UserService bean2 = context.getBean(UserService.class);
		return "number of users: " + bean.findNumberOfUsers();
	}
}
