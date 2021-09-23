package spring.pag067;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class AutowireByTypeMain {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-autowiring-bytype.xml");
		
//		Performer kenny3 = (Performer)context.getBean("kenny3");
//		kenny3.perform();
	
		Person person = (Person)context.getBean("person");
		System.out.println(person);
	}
}
