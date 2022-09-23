package log4jPractice;

import org.apache.logging.log4j.*;

public class Log4jDemo {
	
	private static Logger demoLogger = LogManager.getLogger(Log4jDemo.class.getName());

	public static void main(String[] args) {
		
		System.out.println("This is syso of root : " + demoLogger.getName());
		demoLogger.info("Click successfull root ");
		demoLogger.error("DB connection failed root");
		demoLogger.debug("This is debug root ");
		demoLogger.fatal("This is fatal root");
		demoLogger.trace("This is trace root");
		

	}

}
