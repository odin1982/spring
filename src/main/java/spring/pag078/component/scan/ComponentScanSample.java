package spring.pag078.component.scan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanSample {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-component-scan.xml");
		Guitar guitar = (Guitar)context.getBean("guitar");
		guitar.play();
		
		Guitar guitarra = new Guitar();
		guitarra.play();
	}

}
