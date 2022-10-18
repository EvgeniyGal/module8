package com.drawelement;

public class Quad3D implements IShape3D {
    private Point3D a;
    private Point3D b;
    private Point3D c;
    private Point3D d;

    public Quad3D(Point3D a, Point3D b, Point3D c, Point3D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quad3D() {
        this.a = new Point3D();
        this.b = new Point3D(0, 1);
        this.c = new Point3D(1, 1);
        this.d = new Point3D(1, 0);
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

    public Point3D getD() {
        return d;
    }

    public void setD(Point3D d) {
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
    public Point3D[] getShapeCoord() {
        return new Point3D[]{a, b, c, d};
    }

    @Override
    public String toString() {
        return "Name: 3D Quadrilateral, coordinates is: a" + a + ", b"+ b + ", c" + c + ", d" + d +".";
    }
}
