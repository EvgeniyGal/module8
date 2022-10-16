package com.drawelement;

public interface Shape3d extends Shape {

    default double getDistAtoB(Point3d a, Point3d b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) +
                Math.pow(b.getY() - a.getY(), 2) + Math.pow(b.getZ() - a.getZ(), 2));
    }

}
