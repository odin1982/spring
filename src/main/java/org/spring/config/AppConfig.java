package org.spring.config;

import org.spring.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	//APUNTES-User bean called admin
	@Bean
	public User admin() {
		User user = new User();
		user.setName("Odin");
		user.setSkill("developer");
		return user;
	}
}
