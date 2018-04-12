package cn.xx.study.log4j1demo;

import org.apache.log4j.Logger;

public class Log4j1Demo {

	private static Logger logger = Logger.getLogger(Log4j1Demo.class);

	public static void main(String[] args) {
		logger.debug("Log4j1Demo DebugTest");
		logger.info("Log4j1Demo InfoTest");
		logger.warn("Log4j1Demo WarnTest");
		logger.error("Log4j1Demo ErrorTest");

	}

}
