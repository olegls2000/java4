package model;


public class Circle extends AbstractShape implements Shape, Comparable<Circle> {

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
        Circle circle = (Circle) obj;
        return circle.getSide() == this.side;
    }

    @Override
    public int hashCode() {
        return side;
    }


    @Override
    public int compareTo(Circle o) {
        return (int) (this.getPerimetr() - o.getPerimetr());
    }
}
