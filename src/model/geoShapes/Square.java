package model.geoShapes;

public class Square extends AbstractShape {
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public int compareTo(Circle o) {
        return 0;
    }

    public void printFromSquare(){
        System.out.println("Hello from Square!!!!!");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}