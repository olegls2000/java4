package model;

public class Circle extends AbstractShape implements Shape {

    @Override
    public double getPerimetr() {
        return Math.PI * side;
    }

    public void printFromCircle() {
        System.out.println("Hello from Circle!!!!!");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "side=" + side +
                '}';
    }


    @Override
    public double calculateArea() {
        return 4 * Math.PI * side * side;
    }

    @Override
    public double calculatePerimetr() {
        return 2 * 3.14 * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle perimetr = " + getPerimetr() +
                ", area = " + calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        Circle cr = (Circle) obj;
        return this.side == cr.getSide();
    }
}
