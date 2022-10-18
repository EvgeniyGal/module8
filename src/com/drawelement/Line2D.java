package com.drawelement;

public class Line2D implements IShape2D {

    private Point2D a, b;

    public Line2D(Point2D a, Point2D b) {
        this.a = a;
        this.b = b;
    }

    public Line2D() {
        this.a = new Point2D();
        this.b = new Point2D(1, 1);
    }

    public Line2D(Point2D Point2D) {
        this.a = new Point2D();
        this.b = Point2D;
    }

    public Point2D getA() {
        return a;
    }

    public void setA(Point2D a) {
        this.a = a;
    }

    public Point2D getB() {
        return b;
    }

    public void setB(Point2D b) {
        this.b = b;
    }

    public double getLength() {
        return getDist(a, b);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetr() {
        return 0;
    }

    @Override
    public Point2D[] getShapeCoord() {
        return new Point2D[]{a, b};
    }

    @Override
    public String toString() {
        return "Name: 2D Line, coordinates is: a" + a + ", b"+ b + ".";
    }
}
