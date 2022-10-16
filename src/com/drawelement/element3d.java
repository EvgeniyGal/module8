package com.drawelement;

public interface element3d extends Shape {

    default double getDistAtoB(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) +
                Math.pow(b.getY() - a.getY(), 2) + Math.pow(b.getZ() - a.getZ(), 2));
    }

}
