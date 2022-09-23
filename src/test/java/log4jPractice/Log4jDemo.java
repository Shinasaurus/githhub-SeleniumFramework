package log4jPractice;

import org.apache.logging.log4j.*;

public class Log4jDemo {
	
	private static Logger demoLogger = LogManager.getLogger(Log4jDemo.class.getName());

	public static void main(String[] args) {
		
		System.out.println("This is syso");
		demoLogger.info("Click successfull");
		demoLogger.error("DB connection failed");
		demoLogger.debug("This is debug");
		

	}

}
