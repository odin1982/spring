package spring;

import org.apache.log4j.Logger;

public class Log4JTest {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(Log4JTest.class.getName());
	
	public static void main(String[] args) {
		log.info("Hola mundo Log4J");
	}

}
