package com.example.shapes.shapes2d;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Shape2dTestRunner {
    static {
        init();
    }
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Shape2dTestSuit.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
    private static void init(){
        DOMConfigurator.configure("log4j.xml");
    }

}
