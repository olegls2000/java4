package Homework;

import Model.GeoShapes.Point;
import Model.GeoShapes.Triangle;

public class L6Homework {
    public static void main(String[] args) {
        Point a = new Point(5, -3);
        Point b = new Point(6, -2);
        Point c = new Point(-7, -4);
        /*Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        Point c = new Point(2, 2);*/

        System.out.println("x1 = " + a.getX() + ", y1 = " + a.getY()
                + "\nx2 = " + b.getX() + ", y2 = " + b.getY()
                + "\nx3 = " + c.getX() + ", y3 = " + c.getY());
        Triangle triangle1 = new Triangle(a, b, c);
        System.out.println("P = "
                + triangle1.getTrianglePerimeter());
    }
}