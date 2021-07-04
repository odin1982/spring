package spring.pag090;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Contact contact =(Contact)context.getBean("contact2");
		System.out.println(contact.toString()); 
	}
}
