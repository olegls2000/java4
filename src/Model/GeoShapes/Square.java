package Model.GeoShapes;

public class Square extends AbstractShape {
    public double getPerimeter() {
        return 4 * side;
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