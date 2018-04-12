package cn.xx.study.log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		logger.trace("LogDemo traceTest");
		logger.debug("LogDemo debugTest");
		logger.info("LogDemo infoTest");
		logger.warn("LogDemo warnTest");
		logger.error("LogDemo errorTest");
		logger.fatal("LogDemo fatalTest");
	}

}
