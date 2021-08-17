package spring.pag038;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TicketMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "application-context-2.xml" );
		Ticket ticket = (Ticket)ctx.getBean("ticket");
		Ticket ticket2 = (Ticket)ctx.getBean("ticket");
	}
}
