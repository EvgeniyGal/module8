package com.drawelement;

public class Line {

    private Point a, b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Line() {
        this.a = new Point();
        this.b = new Point(1, 1, 1);
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }
}
