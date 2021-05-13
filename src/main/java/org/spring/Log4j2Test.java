package org.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Se puede usar un archivo xml de configuracion o un properties
public class Log4j2Test {
	private static final Logger log = LogManager.getLogger(Log4j2Test.class.getName());
	public static void main(String[] args) {
		log.info("Hola mundo log4j2");
	}
	
}
