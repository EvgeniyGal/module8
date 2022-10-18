package com.drawelement;

public class Point2D extends Point {

    private double y;

    public Point2D(){

        this(0, 0);
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public Point2D(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + y + ")";
    }
}
