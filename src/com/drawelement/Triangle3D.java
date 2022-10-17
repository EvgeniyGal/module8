package com.drawelement;

public class Triangle3D implements IShape3D {
    private Point3D a;
    private Point3D b;
    private Point3D c;

    public Triangle3D(Point3D a, Point3D b, Point3D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle3D() {
        this.a = new Point3D();
        this.b = new Point3D(1, 1,1);
        this.c = new Point3D(0, 0,1);
    }

    public Point3D getA() {
        return a;
    }

    public void setA(Point3D a) {
        this.a = a;
    }

    public Point3D getB() {
        return b;
    }

    public void setB(Point3D b) {
        this.b = b;
    }

    public Point3D getC() {
        return c;
    }

    public void setC(Point3D c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs(getDistAtoB(a,b) * getDistAtoB(a,c));
    }

    @Override
    public double getPerimetr() {
        return getDistAtoB(a, b) + getDistAtoB(b, c) + getDistAtoB(c, a);
    }

    @Override
    public Point3D[] getShapeCoord() {
        return new Point3D[]{a, b, c};
    }
}
