package model.geoShapes;

public class EqSideTriangle extends AbstractShape {
    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public int compareTo(Circle o) {
        return 0;
    }

    @Override
    public String toString() {
        return "EqSideTriangle{" +
                "side=" + side +
                '}';
    }
}