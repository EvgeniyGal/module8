import com.drawelement.Point3d;
import com.drawelement.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class MyClass implements Shape{

    @Override
    public double getArea() {
        double ghh = Shape.PI;
        return 0;
    }

    @Override
    public double getPerimetr() {
        return 0;
    }

    @Override
    public Point3d[] getShapeCoord() {
        return new Point3d[0];
    }
}