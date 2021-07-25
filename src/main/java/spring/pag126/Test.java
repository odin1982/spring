package spring.pag126;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag040.PerformanceException;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Instrumentalist ins = (Instrumentalist)context.getBean("odin");
		ins.perform();
		//context.publishEvent(new CourseFullEvent(this,course));
	}
}
