package com.drawelement;

public class Line3D implements IShape3D {

    private Point3D a, b;

    public Line3D(Point3D a, Point3D b) {
        this.a = a;
        this.b = b;
    }

    public Line3D() {
        this.a = new Point3D();
        this.b = new Point3D(1, 1, 1);
    }

    public Line3D(Point3D Point3D) {
        this.a = new Point3D();
        this.b = Point3D;
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
    public Point3D[] getShapeCoord() {
        return new Point3D[]{a, b};
    }

}
