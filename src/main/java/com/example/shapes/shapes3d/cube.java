package com.example.shapes.shapes3d;

public class cube extends Shape3d {
    private double side;
    private static final int vertices = 8;
    private static final int edges = 12;
    @Override
    public String draw() {
        return "Drawing cube";
    }

    @Override
    public int noOfVertices() {
        return vertices;
    }

    @Override
    public int noOfEdges() {
        return edges;
    }

    @Override
    public double getSurfaceArea() {
        return 6*Math.pow(side,2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side,3);
    }
}
