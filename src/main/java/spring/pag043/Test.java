package spring.pag043;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.pag040.Juggler;
import spring.pag040.PerformanceException;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\odin\\Documents\\workspace-eclipse\\spring\\spring\\src\\main\\resources\\spring-idol.xml");
		Juggler juggler = (Juggler)ctx.getBean("duke2");
		juggler.perform();
	}

}
