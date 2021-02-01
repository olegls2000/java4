package model;

public class Square extends AbstractShape implements Shape {
    public double getPerimetr() {
        return 4 * side;
    }

    public void printFromSquare() {
        System.out.println("Hello from Square!!!!!");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Square perimetr = " + getPerimetr() +
                ", area = " + calculateArea());
    }


/*    @Override
    public void helloFromSuperInterface() {

    }*/
}
