package Lessons;

import Model.GeoShapes.*;

public class L7Main {

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(1, 5);
        Point c = new Point(10, 10);

        Triangle triangleX = new Triangle(a, b, c);
        System.out.println(triangleX);

        AbstractShape shape1 = new Circle();
        Circle shape11 = new Circle();
        shape11.printFromCircle();
        AbstractShape shape2 = new Square();
        AbstractShape shape3 = new EqSideTriangle();

        //AbstractShape shape4 = new AbstractShape();
        //Circle shape5 = new AbstractShape();

        AbstractShape[] shapes = {new Circle(),
                new Circle(),
                new EqSideTriangle(),
                new EqSideTriangle(),
                new Square(),
                new Square()};

        AbstractShape item = shapes[3];


        AbstractShape biggestPerimShape = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getPerimeter() > biggestPerimShape.getPerimeter()) {
                biggestPerimShape = shape;
            }
        }

        // Circle shapeCircle = (Circle) biggestPerimShape;
        // EqSideTriangle shapeTriangle = (EqSideTriangle) biggestPerimShape;


        if (biggestPerimShape instanceof Circle) {
            System.out.println("Biggest Perimetr has Circle: " + biggestPerimShape.getPerimeter());
        }
        if (biggestPerimShape instanceof Square) {
            //biggestPerimShape.printFromSquare();
            System.out.println("Biggest Perimetr has Square: " + biggestPerimShape.getPerimeter());
            Square squareShape = (Square) biggestPerimShape;
            squareShape.printFromSquare();
        }
        if (biggestPerimShape instanceof EqSideTriangle) {
            System.out.println("Biggest Perimetr has Triangle: " + biggestPerimShape.getPerimeter());
        }

        Class type = biggestPerimShape.getClass();
        System.out.println(type.getName());

        String biggestPerimShapeStr =  biggestPerimShape.toString();
        System.out.println(biggestPerimShapeStr);
    }
}