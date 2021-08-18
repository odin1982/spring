package spring.pag041;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag031.PerformanceException;
import spring.pag033.PoeticJuggler;

public class InstrumentalistMain {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "application-context-2.xml" );
		
		//bean without song nor instrument
//		Instrumentalist instrumentalist = (Instrumentalist)ctx.getBean("kenny");
//		instrumentalist.perform();
		
//		Instrumentalist instrumentalist2 = (Instrumentalist)ctx.getBean("kenny2");
//		instrumentalist2.perform();
		
		Instrumentalist george = (Instrumentalist)ctx.getBean("george");
		george.perform();
		
		Instrumentalist francisco = (Instrumentalist)ctx.getBean("francisco");
		francisco.perform();
		
		Instrumentalist guillermo = (Instrumentalist)ctx.getBean("guillermo");
		guillermo.perform();
		
		PoeticJuggler ochoa = (PoeticJuggler)ctx.getBean("ochoa");
		ochoa.perform();
		
	}

}
