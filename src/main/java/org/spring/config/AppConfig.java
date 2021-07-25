package org.spring.config;

import java.util.Locale;

import javax.sql.DataSource;

import org.spring.interceptor.PerformanceInterceptor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//APUNTES-@Configuration-This declares it as a Spring configuration class
//APUNTES-@EnableWebMvc: This enables Spring's ability to receive and process web requests
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "org.spring.controller", "org.spring.service", "org.spring.interceptor","org.spring.repository" })
public class AppConfig extends WebMvcConfigurerAdapter {
	@Bean(name = "theSource")
	// To force to be executed each time it's called (and return a different object
	// dataSource() each time), use the annotation with a scope @Scope prototype
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();// Se agrego dependencia spring jdbc
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/pruebas?useSSL=false&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true");
		dataSource.setUsername("root");
		dataSource.setPassword("barcelona8");
		return dataSource;
	}

	// Se comenta porque se va usar tiles para JSP

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	// declare Tiles configuration file
	/*
	 * @Bean public TilesConfigurer tilesConfigurer() { TilesConfigurer
	 * tilesConfigurer = new TilesConfigurer(); final String[] definitions = {
	 * "/WEB-INF/tiles.xml" }; tilesConfigurer.setDefinitions(definitions); return
	 * tilesConfigurer; }
	 */
	// declare Tiles as a view resolver

	/*
	 * @Bean public ViewResolver tilesViewResolver() { TilesViewResolver resolver =
	 * new TilesViewResolver(); return resolver; }
	 */
	@Bean
	public HandlerInterceptor performanceInterceptor() {
		PerformanceInterceptor interceptor;
		interceptor = new PerformanceInterceptor();
		return interceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
		registry.addInterceptor(performanceInterceptor()).addPathPatterns("/user/*");
	}

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/messages");
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}

	@Bean
	public HandlerInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	//Store the user language selection in a cookie and declare the default language
	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		localeResolver.setDefaultLocale(new Locale("en"));
		return localeResolver;
	}

//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(localeChangeInterceptor());
//	}
	
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
