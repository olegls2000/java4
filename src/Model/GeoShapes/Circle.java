package Model.GeoShapes;

public class Circle extends AbstractShape {

    @Override
    public double getPerimeter()
    {
        return Math.PI * side;
    }

    public void printFromCircle()
    {
        System.out.println("Hello from Circle!");
    }

    @Override
    public String toString()
    {
        return "Circle{" + "side=" + side + "}";
    }
}
// abstract --> ought to happen
