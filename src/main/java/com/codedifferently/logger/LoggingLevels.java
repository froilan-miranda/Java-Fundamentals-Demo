package logger;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingLevels {

    public static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void setLoggerLevel(){
        logger.setLevel(Level.INFO);
        logger.log(Level.SEVERE, "Uh Oh!");
        logger.log(Level.INFO, "Just so you know");

        // The default logger uses a handler that has default log level (INFO)
        // Must create a handler with finer log level set
        logger.log(Level.FINE, "Hey developer dude");
        logger.log(Level.FINEST, "You're special");
    }
}
