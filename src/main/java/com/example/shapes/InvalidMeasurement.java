package com.example.shapes;

import org.apache.log4j.Logger;

public class InvalidMeasurement extends Exception {
private static final Logger logger = Logger.getLogger(InvalidMeasurement.class);
    public InvalidMeasurement(double value) {
        logger.error("Invalid measurement"+value);
    }
//    public InvalidMeasurement() {
//    }
}
