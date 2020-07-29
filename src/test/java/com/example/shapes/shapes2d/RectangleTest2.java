package com.example.shapes.shapes2d;

import com.example.shapes.InvalidMeasurement;
import com.example.shapes.shapes2d.Rectangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest2 {
    private static Rectangle rectangle = new Rectangle(2.5,4.9);

    @BeforeAll
    void setUp() {
        rectangle = new Rectangle(2.5,4.9);
    }

    @BeforeEach
    void reset() throws InvalidMeasurement {
        rectangle.setHeight(4.9);
        rectangle.setWidth(2.5);
    }

    @Test
    public void getHeight() {
        assertEquals(4.9,rectangle.getHeight());
    }

    @Test
    public void getWidth() {
        assertEquals(2.5,rectangle.getWidth());
    }

    @Test
    public void setHeight() throws InvalidMeasurement {
        rectangle.setHeight(2.9);
        assertEquals(2.9,rectangle.getHeight());
    }

    @Test
    public void setWidth() throws InvalidMeasurement {
        rectangle.setWidth(6.1);
        assertEquals(6.1,rectangle.getWidth());
    }
}