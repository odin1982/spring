package spring.pag068.autowiring.byConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByConstructorMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-autowiring-byconstructor.xml");
		Developer developer = (Developer)context.getBean("developer");
		System.out.println(developer);
	}
}
