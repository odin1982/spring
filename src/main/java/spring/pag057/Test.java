package spring.pag057;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resources/spring-idol.xml");
		
		Performer mico = (Performer)ctx.getBean("mico");
		mico.perform();
	}

}
