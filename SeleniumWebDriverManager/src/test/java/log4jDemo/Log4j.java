package log4jDemo;

import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;


public class Log4j {
	
	static Logger logger = org.apache.logging.log4j.LogManager.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n Hello world....!  \n" );
		
		logger.trace("This is Trace message");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is an warning message");
		logger.fatal("This is an fatal message");
		
		System.out.println("\n Completed");
	}

}
