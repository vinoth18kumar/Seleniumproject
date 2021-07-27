package log4jexamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class basicconfiguratorexapmles {
	
	static Logger logger= Logger.getLogger(basicconfiguratorexapmles.class);
		//Factory Design Pattern
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		logger.debug("This is a debug");
		logger.info("This is as info");
		logger.warn("this is a warn");
		logger.error("this is a error");
		logger.fatal("this is a fatal");
		
		
		
	}

}
