package spring.pag054.spelRefBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class SpelRefBeansMain {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-ref-bean-spel.xml");
		Performer carl = (Performer)context.getBean("carl");
		carl.perform();
	}
}
