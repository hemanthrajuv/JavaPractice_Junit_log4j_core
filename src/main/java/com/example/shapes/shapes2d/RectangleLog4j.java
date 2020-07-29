package com.example.shapes.shapes2d;

import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;

public class RectangleLog4j {
    static {
        init();
    }

    private final static Logger logger = Logger.getLogger(RectangleLog4j.class);

    public static void log(){
        logger.debug("My Debug Log");
        logger.info("My Info Log");
        logger.warn("My Warn Log");
        logger.error("My error log");
        logger.fatal("My fatal log");
    }

    private static void init(){
        DOMConfigurator.configure("log4j.xml");
    }
}
