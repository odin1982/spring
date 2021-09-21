package spring.pag056.spelPerformingOperations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OperationsMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-spel-operations.xml");
		Operations bean = (Operations)context.getBean("operation");
		System.out.println("resultado: " + bean.getResultadoSuma() );
	}
}
