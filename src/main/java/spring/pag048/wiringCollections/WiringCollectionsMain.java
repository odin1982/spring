package spring.pag048.wiringCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class WiringCollectionsMain {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-wiring-collections.xml");
		Performer hank = (Performer)context.getBean("hank");
		hank.perform();
	}
}
