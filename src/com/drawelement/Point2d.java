package com.drawelement;

public class Point2d extends Point {

    private double y;

    public Point2d(){

        this(0, 0);
    }

    public Point2d(double x, double y) {
        super(x);
        this.y = y;
    }

    public Point2d(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
