package com.drawelement;

public class Point {

    private double x;

    public Point(double x) {
        this.x = x;
    }

    public Point() {
        this.x = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }
}
