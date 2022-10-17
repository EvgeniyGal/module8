package com.drawelement;

public class Ellipse2D implements IShape2D {
    private Point2D c;
    private Point2D r1;

    private Point2D r2;

    public Ellipse2D(Point2D c, Point2D r1, Point2D r2) {
        this.c = c;
        this.r1 = r1;
        this.r2 = r2;
    }

    public Ellipse2D() {
        this.c = new Point2D();
        this.r1 = new Point2D(0, 1);
        this.r2 = new Point2D(2, 0);
    }


    public Point2D getC() {
        return c;
    }

    public void setC(Point2D c) {
        this.c = c;
    }

    public Point2D getR1() {
        return r1;
    }

    public void setR1(Point2D r1) {
        this.r1 = r1;
    }

    public Point2D getR2() {
        return r2;
    }

    public void setR2(Point2D r2) {
        this.r2 = r2;
    }

    @Override
    public double getArea() {
        return PI * getDist(c, r1) * getDist(c, r2);
    }

    @Override
    public double getPerimetr() {

        double a = getDist(c, r1);
        double b = getDist(c, r2);
        double h = Math.pow(a - b, 2) / Math.pow(a + b, 2);

        return PI * (a + b) * (1 + 3 * h / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public Point2D[] getShapeCoord() {
        return new Point2D[]{c, r1, r2};
    }
}
