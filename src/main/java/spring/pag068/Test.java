package spring.pag068;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag040.PerformanceException;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Instrumentalist kenny = (Instrumentalist)context.getBean("kenny");
		kenny.perform();
	}

}
