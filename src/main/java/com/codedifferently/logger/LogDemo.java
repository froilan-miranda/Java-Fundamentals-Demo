package com.codedifferently.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogDemo {
    // it is advised that you name your logger the same as your Main Application package
    Logger logger = Logger.getLogger("com.codedifferently.MainApplication");
    public void logTest() {

//        logger.setLevel(Level.SEVERE);  // log severe
//        logger.setLevel(Level.WARNING); // log severe, warning
//        logger.setLevel(Level.INFO);    // log severe, warning, info
//        logger.setLevel(Level.CONFIG);  // log severe, warning, info, config
        logger.setLevel(Level.FINE);    // log severe, warning, info, config, fine
//        logger.setLevel(Level.FINER);   // log severe, warning, info, config, fine, finer
//        logger.setLevel(Level.FINEST);  // log severe, warning, info, config, fine, finer, finest

        logger.log(Level.FINE, "Hey I am here to warn you of something");
    }

    public static void main(String... args){
        LogDemo ld = new LogDemo();
        ld.logTest();
    }
}
