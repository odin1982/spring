package spring.pag040;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AuditoriumMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "application-context-2.xml" );
		Auditorium auditorium =(Auditorium)ctx.getBean("auditorium");
		AuditoriumDefaultMethodSample auditoriumDefault =(AuditoriumDefaultMethodSample)ctx.getBean("auditoriumDefault");
	}

}
