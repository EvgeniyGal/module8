package com.drawelement;

public interface Shape {
    double PI = 3.14;

    double getArea();

    double getPerimetr();

    Point[] getShapeCoord();

    static double getGipotenuza(double k1, double k2) {
        return Math.sqrt(k1 * k1 + k2 * k2);
    }


}
