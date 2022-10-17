package com.drawelement;

public class Triangle2D implements IShape2D {
    private Point2D a;
    private Point2D b;
    private Point2D c;

    public Triangle2D(Point2D a, Point2D b, Point2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle2D() {
        this.a = new Point2D();
        this.b = new Point2D(1, 1);
        this.c = new Point2D(0, 1);
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

    public Point2D getC() {
        return c;
    }

    public void setC(Point2D c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs(getDist(a, b) * getDist(a, c));
    }

    @Override
    public double getPerimetr() {
        return getDist(a, b) + getDist(b, c) + getDist(c, a);
    }

    @Override
    public Point2D[] getShapeCoord() {
        return new Point2D[]{a, b, c};
    }
}
