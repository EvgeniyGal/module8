package com.drawelement;

public interface IShape {
    double PI = 3.14;

    double getArea();

    double getPerimetr();

    Point2D[] getShapeCoord();

    static double getGipotenuza(double k1, double k2) {
        return Math.sqrt(k1 * k1 + k2 * k2);
    }


}
