package com.drawelement;

public class Line2d implements Shape2d {

    private Point2d a, b;

    public Line2d(Point2d a, Point2d b) {
        this.a = a;
        this.b = b;
    }

    public Line2d() {
        this.a = new Point2d();
        this.b = new Point2d(1, 1);
    }

    public Line2d(Point2d point2d) {
        this.a = new Point2d();
        this.b = point2d;
    }

    public Point2d getA() {
        return a;
    }

    public void setA(Point2d a) {
        this.a = a;
    }

    public Point2d getB() {
        return b;
    }

    public void setB(Point2d b) {
        this.b = b;
    }

    public double getLength() {
        return getDistAtoB(a, b);
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
    public Point2d[] getShapeCoord() {
        return new Point2d[]{a, b};
    }

}
