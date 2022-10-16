package com.drawelement;

public class Point3d extends Point {

    public Point3d() {
        super(0, 0, 0);
    }

    public Point3d(double x, double y) {
        super(x, y, 0);
    }

    public Point3d(double x, double y, double z) {
        super(x, y, z);
    }

    public Point3d(Point3d Point3d) {
        super(Point3d.getX(), Point3d.getY(), 0);
    }

}
