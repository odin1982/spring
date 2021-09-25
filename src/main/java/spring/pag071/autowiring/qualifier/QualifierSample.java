package spring.pag071.autowiring.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierSample {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-annotatios-qualifier.xml");
		Profile profile = (Profile)context.getBean("profile");
		profile.printAge();
		profile.printName();
		
		Player player = (Player)context.getBean("messi");
		player.getTeam().play();
	}

}
