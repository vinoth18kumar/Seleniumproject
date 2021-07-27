package log4jexamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class xmlconfigurationexample {
	static Logger logger= Logger.getLogger(xmlconfigurationexample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is a debug");
		logger.info("This is as info");
		logger.warn("this is a warn");
		logger.error("this is a error");
		logger.fatal("this is a fatal");
	}

}
