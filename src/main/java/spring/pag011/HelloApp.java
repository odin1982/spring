package spring.pag011;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {
	public static void main(String[] args) {
		//esta linea funciona si pongo el hello.xml en la raiz del proyecto
		//debemos usar ClassPathResource 
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("hello.xml"));
		GreetingService greetingService = (GreetingService)factory.getBean("greetingService");
		greetingService.sayGreeting();
	}

}
