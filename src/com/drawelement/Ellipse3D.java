package com.drawelement;

public class Ellipse3D implements IShape3D {
    private Point3D c;
    private Point3D r1;
    private Point3D r2;

    public Ellipse3D(Point3D c, Point3D r1, Point3D r2) {
        this.c = c;
        this.r1 = r1;
        this.r2 = r2;
    }

    public Ellipse3D() {
        this.c = new Point3D();
        this.r1 = new Point3D(0, 1);
        this.r2 = new Point3D(2, 0);
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

    public Point3D getR2() {
        return r2;
    }

    public void setR2(Point3D r2) {
        this.r2 = r2;
    }

    @Override
    public double getArea() {
        return PI * getDist(c, r1) * getDist(c, r2);
    }

    @Override
    public double getPerimetr() {

        double a = getDist(c, r1);
        double b = getDist(c, r2);
        double h = Math.pow(a - b, 2) / Math.pow(a + b, 2);

        return PI * (a + b) * (1 + 3 * h / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public Point3D[] getShapeCoord() {
        return new Point3D[]{c, r1, r2};
    }

    @Override
    public String toString() {
        return "Name: 3D Ellipse, coordinates is: center" + c + ", radius 1"+ r1 + ", radius 2" + r2 + ".";
    }
}
