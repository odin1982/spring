package spring.pag040;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws PerformanceException {
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\odin\\Documents\\workspace-eclipse\\spring\\spring\\src\\main\\resources\\spring-idol.xml");
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\odina\\Documents\\eclipse-workspace\\spring\\spring\\src\\main\\resources\\spring-idol.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resources/spring-idol.xml");
		
		//A simple bean
		Performer odin = (Performer)ctx.getBean("odin");
		odin.perform();
		
		Performer sandra = (Performer)ctx.getBean("sandra");
		sandra.perform();
		
		Performer amaya = (Performer)ctx.getBean("amaya");
		amaya.perform();
	}

}
