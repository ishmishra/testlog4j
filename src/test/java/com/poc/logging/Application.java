package com.poc.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    //private static final Logger log = LogManager.getLogger(Application.class);
    private static final Logger log = LogManager.getLogger();

    public static void executeMyApplication() {

        //Let's log here and see how the flow of logs from one Java class to another
        log.info("This log is being generated withing Application java class");
        log.info("This log also tells you the java class and the line number where this log is called- line 15");

    }
}
