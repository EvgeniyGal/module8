package com.drawelement;

public class Circle3D implements IShape3D {
    private Point3D c;
    private Point3D r1;

    public Circle3D(Point3D c, Point3D r1) {
        this.c = c;
        this.r1 = r1;
    }

    public Circle3D() {
        this.c = new Point3D();
        this.r1 = new Point3D(1, 1);
    }

    public Point3D getC() {
        return c;
    }

    public void setC(Point3D c) {
        this.c = c;
    }

    public Point3D getR1() {
        return r1;
    }

    public void setR1(Point3D r1) {
        this.r1 = r1;
    }

    @Override
    public double getArea() {
        return PI * getDist(c, r1) * getDist(c, r1);
    }

    @Override
    public double getPerimetr() {
        return 2 * PI * getDist(c, r1);
    }

    @Override
    public Point3D[] getShapeCoord() {
        return new Point3D[]{c, r1};
    }

    @Override
    public String toString() {
        return "Name: 3D Circle, coordinates is: center" + c + ", radius" + r1 + ".";
    }
}
