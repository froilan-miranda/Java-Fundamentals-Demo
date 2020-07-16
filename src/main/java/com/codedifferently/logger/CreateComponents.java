package com.codedifferently.logger;

import java.util.logging.*;

public class CreateComponents {

    static Logger logger = Logger.getLogger("io.codedifferently");

    public static void createLogComponent(){

        Handler h = new ConsoleHandler();

        Formatter f = new SimpleFormatter();

        h.setFormatter(f);

        //stop logger from using parent classes handler
        logger.setUseParentHandlers(false);

        logger.addHandler(h);
        logger.setLevel(Level.OFF);
        logger.log(Level.INFO, "We're Logging!");
    }

}
