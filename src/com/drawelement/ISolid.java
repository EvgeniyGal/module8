package com.drawelement;

public interface ISolid {
    double PI = 3.14;

    double getSuface();

    double getVolume();

    Point3D[] getShapeCoord();

    default double getDist(Point3D a, Point3D b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) +
                Math.pow(b.getY() - a.getY(), 2) + Math.pow(b.getZ() - a.getZ(), 2));
    }

}
