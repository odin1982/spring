package spring.pag076;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag040.PerformanceException;
import spring.pag068.Instrumentalist;

public class TestAbstractingBean {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Instrumentalist pablo = (Instrumentalist)context.getBean("pablo");
		pablo.perform();
		
		Instrumentalist pedro = (Instrumentalist)context.getBean("pedro");
		pedro.perform();
		
		Instrumentalist marco = (Instrumentalist)context.getBean("marco");
		marco.perform();
	}
}
