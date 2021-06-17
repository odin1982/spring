package spring.tutorials.autowiring.byName._01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = (A)context.getBean("a",A.class);
		a.display();
	}
}
