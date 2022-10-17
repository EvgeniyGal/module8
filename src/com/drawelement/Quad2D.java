package com.drawelement;

public class Quad2D implements IShape2D {
    private Point2D a;
    private Point2D b;
    private Point2D c;
    private Point2D d;

    public Quad2D(Point2D a, Point2D b, Point2D c, Point2D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quad2D() {
        this.a = new Point2D();
        this.b = new Point2D(0, 1);
        this.c = new Point2D(1, 1);
        this.d = new Point2D(1, 0);
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

    public Point2D getD() {
        return d;
    }

    public void setD(Point2D d) {
        this.d = d;
    }

    @Override
    public double getArea() {
        return Math.abs(getDist(a, c) * getDist(a, d));
    }

    @Override
    public double getPerimetr() {
        return getDist(a, b) + getDist(b, c) +
                getDist(c, d) + getDist(d, a);
    }

    @Override
    public Point2D[] getShapeCoord() {
        return new Point2D[]{a, b, c, d};
    }
}
