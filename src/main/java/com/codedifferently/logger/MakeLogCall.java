package com.codedifferently.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MakeLogCall {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void createLogger1(){

        LogManager lm = LogManager.getLogManager();
        Logger logger = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.log(Level.INFO, "My first log message");
        logger.log(Level.INFO, "Another message");
    }

    public static void createLogger2(){
        logger.log(Level.INFO, "My first static log message");
        logger.log(Level.INFO, "Another static message");
    }
    public static void createLoggerWithHandler(){
        String loggerName = "io.codedifferently";
        Logger log = Logger.getLogger(loggerName);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        log.addHandler(handler);
        log.setLevel(Level.ALL);

        log.log(Level.FINE, "just testing");
    }
}
