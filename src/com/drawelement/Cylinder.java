package com.drawelement;

public class Cylinder implements ISolid {

    private Point3D c;
    private Point3D r;
    private Point3D h;


    public Cylinder(Point3D c, Point3D r, Point3D h) {
        this.c = c;
        this.r = r;
        this.h = h;
    }


    public Cylinder() {
        this.c = new Point3D(0, 0, 0);
        this.r = new Point3D(0, 1, 0);
        this.h = new Point3D(0, 0, 1);

    }

    @Override
    public double getSuface() {
        return Math.PI * Math.pow(getDist(c, r), 2) * 2 + Math.PI * 2 * getDist(c, r) * getDist(c, h);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getDist(c, r), 2) * getDist(c, h);
    }

    @Override
    public Point3D[] getShapeCoord() {
        return new Point3D[]{c, r, h};
    }
}
