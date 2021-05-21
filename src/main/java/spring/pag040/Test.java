package spring.pag040;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\odin\\Documents\\workspace-eclipse\\spring\\spring\\src\\main\\resources\\spring-idol.xml");
		Performer performer = (Performer)ctx.getBean("duke");
		performer.perform();
	}

}
