package log4jagain;

import org.apache.logging.log4j.*;

public class Log4jDemoAgain {
	
	private static Logger demoLogger = LogManager.getLogger(Log4jDemoAgain.class.getName());

	public static void main(String[] args) {
		
		String str ="C:\\Shine\\automcode\\githhub-SeleniumFramework\\.\\logs\\Logdemo-01:12:17:159.log\n";
		System.out.println(str.charAt(62));
		
		System.out.println("This is syso: " + demoLogger.getName());
		demoLogger.info("Click successfull");
		demoLogger.error("DB connection failed");
		demoLogger.debug("This is debug");
		demoLogger.fatal("This is fatal");
		demoLogger.trace("This is trace");
		demoLogger.info("Click successfull");
		demoLogger.error("DB connection failed");
		demoLogger.debug("This is debug");
		demoLogger.fatal("This is fatal");
		demoLogger.trace("This is trace");
		demoLogger.fatal("fatal message just for localbranch2");
		

	}

}
