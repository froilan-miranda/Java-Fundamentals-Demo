package com.codedifferently.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogMethods {

    public static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void createConvenienceMethod(){

        logger.setLevel(Level.ALL);

        //Convenience Method
        logger.info("just testing");
    }

    public static void createPreciseLog(){

        logger.setLevel(Level.ALL);

        // precise log configurations allow us to set which class and method to log
        logger.logp(Level.SEVERE, "io.vaquero.SomeClass)", "someMethod", "It is broke");

    }

    public static void preciseConvenienceMethods(){

        logger.setLevel(Level.ALL);

        logger.entering("io.vaquero.SomeClass", "someMethod");
        logger.logp(Level.SEVERE, "io.vaquero.SomeClass)", "someMethod", "It is broke");
        logger.exiting("io.vaquero.SomeClass", "someMethod");

    }

    public static void parameterizedMessage(){

        logger.setLevel(Level.ALL);

        logger.log(Level.INFO, "{0} is my favorite", "Java");
        logger.log(Level.INFO, "{0} is {1} days from {2}", new Object[]{"Wed", 2, "Fri"});

    }

    public static void parameterizedMessage2(String left, String right){
        String loggerName = "io.codedifferently";
        Logger log = Logger.getLogger(loggerName);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        log.addHandler(handler);
        log.setLevel(Level.ALL);

        //log handler must be set to FINER to see entering/exiting logs
        log.entering("io.codedifferently.LogMethods", "parameterizedMessage2()", new Object[]{left, right});
        String result = "<" + left + right + ">";
        log.exiting("io.codedifferently.LogMethods", "parameterizedMessage2()", result);
    }
}
