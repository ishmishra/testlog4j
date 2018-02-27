package com.poc.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Ish
 * This class will give us an overview of how logging functionality will look like
 */
public class TestLogging {

    private static final Logger log = LogManager.getLogger();

    /*
    Line above can also be replaced with following lines:

     private static final Logger logger = LogManager.getLogger("TestLogging");
     private static final Logger logger = LogManager.getLogger(TestLogging.class.getName());
     private static final Logger logger = LogManager.getLogger(TestLogging.class);

     @Ish: for now lets avoid giving a class name. Later if it appears to be necessary we can choose from above three.

     */

    public static void main(String[] args) {


//        logs within this class
        log.info("This is done to test info log");
        log.error("This is done to test error log");
        log.debug("This is done to test debug log");

//        Calling a method from a diff class to see the flow of logs between different java classes
//        This will give us an idea of how our logs will look like going through different steps files

        Application.executeMyApplication();

//        We can also pass objects along with our log messages

//        log.debug("Integer.MAX_VALUE = %,d", Integer.MAX_VALUE);
//        log.debug("Long.MAX_VALUE = %,d", Long.MAX_VALUE);


    }

}
