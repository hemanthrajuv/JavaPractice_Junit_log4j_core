package com.example.shapes.shapes3d;

public class Shpere extends Shape3d {
    private double radius;
    private static final int vertices = 0;
    private static final int edges = 1;
    @Override
    public String draw() {
        return "Drawing sphere";
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
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}
