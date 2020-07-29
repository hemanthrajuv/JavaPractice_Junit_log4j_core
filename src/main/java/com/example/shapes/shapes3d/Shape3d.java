package com.example.shapes.shapes3d;

import com.example.shapes.*;

abstract class Shape3d implements Shape3dInterface, Shape{
    @Override
    public String draw() {
        return "";
    }

    @Override
    public int noOfVertices() {

        return 0;
    }

    @Override
    public int noOfEdges() {

        return 0;
    }

    @Override
    public double getSurfaceArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
