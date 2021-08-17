package spring.pag037;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StageMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "application-context-2.xml" );
		Stage stage = (Stage)ctx.getBean("theStage");
		
		//Solo se crea una instancia ya que es un bean de tipo singleton
		Stage stage2 = (Stage)ctx.getBean("theStage");
		
	}
}
