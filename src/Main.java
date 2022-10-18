import com.drawelement.*;
import com.printers.ConsolePrinter;

public class Main {
    public static void main(String[] args) {

        //Add new Points
        Point a1d = new Point(5.6);
        Point2D a2d = new Point2D(9.5, 8.6);
        Point2D b2d = new Point2D(25.6, -63.5);
        Point2D c2d = new Point2D(3.5, 65.2);
        Point2D d2d = new Point2D(265, 6.5);
        Point3D a3d = new Point3D(52, 53.6, -659);
        Point3D b3d = new Point3D(6, -3.6, -659);
        Point3D c3d = new Point3D(-36.4, 3.6, 62.5);
        Point3D d3d = new Point3D(21.5, 62.4, -5);

        //Add new shapes
        Line2D line2D = new Line2D(a2d, c2d);
        Line3D line3D = new Line3D(b3d, d3d);
        Triangle2D triangle2D = new Triangle2D(a2d, d2d, c2d);
        Triangle3D triangle3D = new Triangle3D(b3d, c3d, d3d);
        Circle3D circle3D = new Circle3D(c3d, d3d);

        //Add new solids
        Sphere sphere = new Sphere(a3d, d3d);
        Cylinder cylinder = new Cylinder(b3d, c3d, d3d);

        ConsolePrinter consolePrinter = new ConsolePrinter();

        //Print elements

        consolePrinter.elementPrinter(new Point[]{a1d, a2d, b2d, c3d});
        consolePrinter.shapePrinter(new IShape[]{line2D, line3D, triangle2D, triangle3D, circle3D});
        consolePrinter.elementPrinter(new ISolid[]{sphere, cylinder});

//        Print elements detail
        System.out.println("Area of 2D Triangle is: " + triangle2D.getArea() + " m2.");
        System.out.println("Area of 3D Triangle is: " + triangle3D.getArea() + " m2.");
        System.out.println("Perimeter  of 2D Triangle is: " + triangle2D.getPerimetr() + " m.");
        System.out.println("Perimeter  of 3D Triangle is: " + triangle3D.getPerimetr() + " m.");
        System.out.println("Surface of sphere is: " + sphere.getSuface() + " m2.");
        System.out.println("Surface of cylinder is: " + cylinder.getSuface() + " m3.");
        System.out.println("Volume of sphere is: " + sphere.getVolume() + " m2.");
        System.out.println("Volume of cylinder is: " + cylinder.getVolume() + " m3.");


    }
}

