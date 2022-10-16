package com.drawelement;

public class Triangle2d implements Shape2d {
    Point3d a;
    Point3d b;
    Point3d c;

    public Triangle2d(Point3d a, Point3d b, Point3d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle2d() {
        this.a = new Point3d();
        this.b = new Point3d(1, 1);
        this.c = new Point3d(0, 1);
    }

    public Point3d getA() {
        return a;
    }

    public void setA(Point3d a) {
        this.a = a;
    }

    public Point3d getB() {
        return b;
    }

    public void setB(Point3d b) {
        this.b = b;
    }

    public Point3d getC() {
        return c;
    }

    public void setC(Point3d c) {
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
    public Point3d[] getShapeCoord() {
        return new Point3d[]{a, b, c};
    }
}
