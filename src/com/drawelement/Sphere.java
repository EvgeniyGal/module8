package com.drawelement;

public class Sphere implements ISolid, IShape3D {

    private Point3D c;
    private Point3D r;

    public Sphere(Point3D c, Point3D r) {
        this.c = c;
        this.r = r;
    }

    public Sphere() {
        this.c = new Point3D(0, 0, 0);
        this.r = new Point3D(0, 0, 1);
    }

    @Override
    public double getSuface() {
        return 4 * Math.PI * Math.pow(getDist(c, r), 2);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * (Math.PI * Math.pow(getDist(c, r), 3));
    }

    @Override
    public Point3D[] getShapeCoord() {
        return new Point3D[]{c, r};
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
    public String toString() {
        return "Name: Sphere, coordinates is: center" + c + ", radius"+ r + ".";
    }
}
