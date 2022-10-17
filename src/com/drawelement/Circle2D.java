package com.drawelement;

public class Circle2D implements IShape2D {
    private Point2D c;
    private Point2D r1;

    public Circle2D(Point2D c, Point2D r1) {
        this.c = c;
        this.r1 = r1;
    }

    public Circle2D() {
        this.c = new Point2D();
        this.r1 = new Point2D(1, 1);
    }


    public Point2D getC() {
        return c;
    }

    public void setC(Point2D c) {
        this.c = c;
    }

    public Point2D getR1() {
        return r1;
    }

    public void setR1(Point2D r1) {
        this.r1 = r1;
    }

    @Override
    public double getArea() {
        return PI * getDist(c, r1);
    }

    @Override
    public double getPerimetr() {
        return 2 * PI * getDist(c, r1);
    }

    @Override
    public Point2D[] getShapeCoord() {
        return new Point2D[]{c, r1};
    }
}
