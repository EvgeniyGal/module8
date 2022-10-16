package com.drawelement;

public class Line2d implements Shape2d {

    private Point3d a, b;

    public Line2d(Point3d a, Point3d b) {
        this.a = a;
        this.b = b;
    }

    public Line2d() {
        this.a = new Point3d();
        this.b = new Point3d(1, 1);
    }

    public Line2d(Point3d Point3d) {
        this.a = new Point3d();
        this.b = Point3d;
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
    public Point3d[] getShapeCoord() {
        return new Point3d[]{a, b};
    }

}
