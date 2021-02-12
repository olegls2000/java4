package model.geoShapes;

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

    @Override
    public boolean equals(Object obj) {
        Circle circle = (Circle) obj;
        return super.getSide() == this.side;
    }

    @Override
    public int hashCode() {
        return side;
    }

}
// abstract --> ought to happen
