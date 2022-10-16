package com.drawelement;

public class triangle2d implements element2d {
    Point a;
    Point b;
    Point c;

    public triangle2d(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public triangle2d() {
        this.a = new Point();
        this.b = new Point(1, 1, 0);
        this.c = new Point(0, 1, 0);
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
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
    public Point[] getShapeCoord() {
        return new Point[]{a, b, c};
    }
}
