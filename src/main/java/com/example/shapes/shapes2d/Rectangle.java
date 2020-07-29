package com.example.shapes.shapes2d;

import com.example.shapes.InvalidMeasurement;
import org.apache.log4j.Logger;

public class Rectangle extends Shape2d{
    private double width;
    private double height;
    private static final int vertices = 4;
    private static final int edges = 4;
    private static final Logger logger = Logger.getLogger(Rectangle.class);
    public Rectangle(){}

    public Rectangle(double w, double h) {
        if (w<=0||h<=0)
        logger.warn("Some measurements are negative"+w+","+h);
        this.width=w;
        this.height=h;
    }

    public void setHeight(double height) throws InvalidMeasurement{
        if (height<=0){
            throw new InvalidMeasurement(height);
        }
        this.height = height;
    }

    public void setWidth(double width) throws InvalidMeasurement{
        if (width<=0){
            throw new InvalidMeasurement(width);
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        logger.debug("width & height to calculate perimeter of rectangle are"+width+"&"+height);
        return width+height;
    }

    @Override
    public double getArea() {
        logger.debug("width & height to calculate area of rectangle are"+width+"&"+height);
        return width*height;
    }

    @Override
    public String draw() {
        return "drawing rectangle";
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
    public String toString() {
        return "width:"+width+ " ,heigth:"+height;
    }
}
