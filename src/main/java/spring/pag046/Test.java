package spring.pag046;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.pag040.PerformanceException;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resources/spring-idol.xml");
		Instrumentalist bean = (Instrumentalist)ctx.getBean("kenny2");
		bean.perform();
	}
}
