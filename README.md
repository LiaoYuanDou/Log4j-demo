# Log4j-demo
在我们平常开发中通常要用到日志记录；

日志记录的好处：记录用户的操作、程序的异常堆栈记录、为数据分析提供依据等。

日志记录常用的工具：log4j、slf4j和logback。

log4j现在出了两个版本：log4j-1.x和log4j-2.x。

## log4j-1.x

log4j-1.x的默认配置文件是：log4j.properties。

获取log记录器的默认方法：
```
private static Logger logger = Logger.getLogger(Log4j1Demo.class);

Logger.debug ( Object message ) ;  
Logger.info ( Object message ) ;  
Logger.warn ( Object message ) ;  
Logger.error ( Object message ) ;
```

## log4j-2.x

log4j-2.x的默认配置文件是：log4j2.xml。

获取log记录器的默认方法：
```
Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

logger.trace(Object message);
logger.debug(Object message);
logger.info(Object message);
logger.warn(Object message);
logger.error(Object message);
logger.fatal(Object message);
```
