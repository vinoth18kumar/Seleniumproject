package log4jexamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Propertieconfiguratorexamples {
	static Logger logger= Logger.getLogger(Propertieconfiguratorexamples.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.Properties");
		
		logger.debug("This is a debug");
		logger.info("This is as info");
		logger.warn("this is a warn");
		logger.error("this is a error");
		logger.fatal("this is a fatal");
	}

}
