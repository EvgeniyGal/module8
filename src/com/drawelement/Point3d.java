package com.drawelement;

public class Point3d extends Point2d {

    private double z;

    public Point3d() {
        super(0, 0);
        this.z = 0;
    }

    public Point3d(double x, double y) {
        super(x, y);
        this.z = 0;
    }

    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3d(Point2d point2d) {
        super(point2d.getX(), point2d.getY());
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
