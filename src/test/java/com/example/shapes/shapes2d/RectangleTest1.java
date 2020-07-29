package com.example.shapes.shapes2d;

//import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest1 {
    private static Rectangle rectangle;

    @BeforeAll
    static void setUp() {
        rectangle = new Rectangle(2.6,4.9);
    }

    @Test
    @DisplayName("Rectangle perimeter test")
    public void testgetPerimeter() {
        assertEquals(7.5,
                rectangle.getPerimeter());
    }

    @Test
    @DisplayName("Rectangle area aest")
    public void getArea() {
        assertEquals(12.74,
                rectangle.getArea());
    }

    @Test
    @DisplayName("Rectangle vertices test")
    public void noOfVertices() {
        assertEquals(4,
                rectangle.noOfVertices());
    }

    @Test
    @DisplayName("Rectangle edge test")
    public void noOfEdges() {
        assertEquals(4,
                rectangle.noOfEdges());
    }
}