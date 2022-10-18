package com.printers;

import com.drawelement.IShape;
import com.drawelement.ISolid;
import com.drawelement.Point;

/**
 * This class contains methods to print different drawing elements to the Console.
 * */
public class ConsolePrinter {

    /**
     * This method print all type of shapes.
     * */
    public void shapePrinter(IShape[] iShapes) {
        for (IShape iShape :
                iShapes) {
            System.out.println(iShape);
        }
    }

    /**
     * This method print all type of solids.
     * */
    public void solidPrinter(ISolid[] iSolids) {
        for (ISolid iSolid :
                iSolids) {
            System.out.println(iSolid);
        }
    }

    /**
     * This method print all type of points.
     * */
    public void pointPrinter(Point[] points) {
        for (Point point :
                points) {
            System.out.println(point);
        }
    }

}
