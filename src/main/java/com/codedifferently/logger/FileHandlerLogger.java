package com.codedifferently.logger;

import java.io.IOException;
import java.util.logging.*;

public class FileHandlerLogger {

    static Logger logger = Logger.getLogger("io.codedifferently");

    public static void fileHandlerLog() {

        try {
            FileHandler h = new FileHandler("%h/Desktop/tmp/myapp_%g.log", 1000, 4);
            h.setFormatter(new SimpleFormatter());
            Handler h2 = new ConsoleHandler();
            h2.setFormatter(new SimpleFormatter());
            logger.addHandler(h);
            logger.addHandler(h2);
        }catch(IOException err){
            logger.log(Level.WARNING, "{0}", err);
        }

    }

}
