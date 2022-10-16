package com.drawelement;

public class Triangle2d implements Shape2d {
    Point2d a;
    Point2d b;
    Point2d c;

    public Triangle2d(Point2d a, Point2d b, Point2d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle2d() {
        this.a = new Point2d();
        this.b = new Point2d(1, 1);
        this.c = new Point2d(0, 1);
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

    public Point2d getC() {
        return c;
    }

    public void setC(Point2d c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        return Math.abs(0.5 * (a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * a.getY() -
                a.getY() * b.getX() - b.getY() * c.getX() - c.getY() * a.getX()));
    }

    @Override
    public double getPerimetr() {
        return getDistAtoB(a, b) + getDistAtoB(b, c) + getDistAtoB(c, a);
    }

    @Override
    public Point2d[] getShapeCoord() {
        return new Point2d[]{a, b, c};
    }
}
