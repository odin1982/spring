package org.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//APUNTES-@Configuration-This declares it as a Spring configuration class
//APUNTES-@EnableWebMvc: This enables Spring's ability to receive and process web requests
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.spring.controller"})
public class AppConfig {

}
