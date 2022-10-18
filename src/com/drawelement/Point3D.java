package com.drawelement;

public class Point3D extends Point2D {

    private double z;

    public Point3D() {
        super(0, 0);
        this.z = 0;
    }

    public Point3D(double x, double y) {
        super(x, y);
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(Point3D Point3D) {
        super(Point3D.getX(), Point3D.getY());
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
