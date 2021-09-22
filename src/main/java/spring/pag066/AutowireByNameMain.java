package spring.pag066;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class AutowireByNameMain {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-autowiring-byname.xml");
		
		Performer kenny2 = (Performer)context.getBean("kenny2");
		kenny2.perform();
		
		Performer kenny3 = (Performer)context.getBean("kenny3");
		kenny3.perform();
	}
}
