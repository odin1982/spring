package spring.pag033;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class JugglerMain {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "application-context-2.xml" );
		
		Performer performer = (Performer)ctx.getBean("duke");
		performer.perform();
		System.out.println();
		
		Performer performer15 = (Performer)ctx.getBean("duke15beanbags");
		performer15.perform();
		System.out.println();
		
		Performer poeticDuke = (Performer)ctx.getBean("poeticDuke");
		poeticDuke.perform();
		System.out.println();
		
		Poem sonnet29 = new Sonnet29();
		Performer duke = new PoeticJuggler(60, sonnet29);
		duke.perform();
	}
}
