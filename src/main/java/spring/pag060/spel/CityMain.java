package spring.pag060.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext-spel-operations.xml");
		City city = (City)context.getBean("city");
		System.out.println("chosen city:" + city.getChosenCity());
	}
}
