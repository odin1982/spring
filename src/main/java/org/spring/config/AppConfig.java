package org.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//APUNTES-@Configuration-This declares it as a Spring configuration class
//APUNTES-@EnableWebMvc: This enables Spring's ability to receive and process web requests
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {	"org.spring.controller",
								"org.spring.service"})
public class AppConfig {
	@Bean(name="theSource")
	//To force to be executed each time it's called (and return a different object dataSource() each time), use the annotation with a scope @Scope prototype
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();//Se agrego dependencia spring jdbc
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/orderapi");
		dataSource.setUsername("root");
		dataSource.setPassword("barcelona8");
		return dataSource;
	}

}
