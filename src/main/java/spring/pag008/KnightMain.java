package spring.pag008;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pag007.Knight;
import spring.pag007.QuestException;

public class KnightMain {
	public static void main(String[] args) throws QuestException {
		ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
		Knight knight = (BraveKnight)context.getBean("knight");
		knight.embarkOnQuest();
	}
}
