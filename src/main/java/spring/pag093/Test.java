package spring.pag093;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Rabbit rabbit = (Rabbit)context.getBean("bugs");
		System.out.println("description:" + rabbit.getDescription());
	}
}
