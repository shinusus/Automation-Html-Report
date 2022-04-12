package com.Automatingtest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Configurationlog {
	public static Logger Log=Logger.getLogger(Configurationlog.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		Log.debug("Debug");
		Log.info("Info");
		Log.warn("warn");
		Log.error("error");
		Log.fatal("Fatal");
		
	}

}
