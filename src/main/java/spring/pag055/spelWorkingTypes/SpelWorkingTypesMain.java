package spring.pag055.spelWorkingTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class SpelWorkingTypesMain {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-spel-working-types.xml");
		Performer carl = (Performer)context.getBean("carl");
		carl.perform();
	}
}
