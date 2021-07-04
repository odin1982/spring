package org.spring.main;

import org.spring.config.AppConfig;
import org.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User)context.getBean("admin");
		System.out.println("name --> " + user.getName());
		System.out.println("skill --> " + user.getSkill());
		context.close();
	}
}
