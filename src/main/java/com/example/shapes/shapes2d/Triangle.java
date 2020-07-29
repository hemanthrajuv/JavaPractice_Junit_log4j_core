package com.example.shapes.shapes2d;

public class Triangle extends Shape2d {
    private double side1;
    private double side2;
    private double side3;

    private static final int vertices = 3;
    private static final int edges = 3;

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public double getArea() {
        return side1*side2*side3;
    }

    @Override
    public String draw() {
        return "drawing traingle";
    }

    @Override
    public int noOfVertices() {
        return vertices;
    }

    @Override
    public int noOfEdges() {
        return edges;
    }
}
