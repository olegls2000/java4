package lessons;

import model.Circle;
import model.Shape;
import model.Square;
import model.d3.*;

public class L8Main {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.printInfo();
        shape2.printInfo();

        shape1.calculatePerimetr();
        shape2.calculatePerimetr();

        System.out.println(shape1.INTERFACE_FIELD);
        System.out.println(Shape.INTERFACE_FIELD);
        //Shape.INTERFACE_FIELD = 101;

        // Создайте интерфейс обьемная фигура, в который поместите константу Пи, и метод по нахождению обьема.
        // Реализуйте данный интерфейс
        // Реализуйте Интерфейс обьединяющий два интерфейса
        //find shape3D with a smallest volume!!!
        WithVolume[] shapesWithVolumes = {new Cylinder(), new Parallelepiped(), new Sphere()};
        WithSurfaceArea[] shapesWithSurfaceArea = {new Cylinder(), new Parallelepiped(), new Sphere()};
    }
}
