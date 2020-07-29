package com.example.shapes.shapes2d;
import com.example.shapes.*;

public abstract class Shape2d
       implements Shape2dInterface, Shape
{
   @Override
    public double getPerimeter() {
        return 0;
    }

   @Override
    public double getArea() {
        return 0;
    }

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
}
