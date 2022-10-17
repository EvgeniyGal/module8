package com.drawelement;

public interface IShape2D extends IShape {

    Point2D[] getShapeCoord();

    default double getDistAtoB(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(b.getX() - a.getX(),2) + Math.pow(b.getY() - a.getY(),2));
    }


}
