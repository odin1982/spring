package spring.pag078.componentscan.filter.component.include.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag078.componentscan.filter.component.include.services.CustomerService;

public class ComponentScanFilterInclude {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-component-scan-include.xml");
		CustomerService cust = (CustomerService)context.getBean("customerService");
		System.out.println(cust);
	}
}
