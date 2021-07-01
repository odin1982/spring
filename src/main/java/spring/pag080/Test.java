package spring.pag080;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ejemplo 1
		Performer harry = (Magician)context.getBean("harry");
		harry.perform();
		
		
//		Magician harryTiger = (Magician)context.getBean("harryTiger");
//		harryTiger.perform();
	}
}
