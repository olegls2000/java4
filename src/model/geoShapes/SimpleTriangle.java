package model.geoShapes;

public class SimpleTriangle {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) {
        validateSides(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        validateSides(a, this.b, this.c);
        this.a = a;
    }

    public void setB(int b) {
        validateSides(this.a, b, this.c);
        this.b = b;
    }

    public void setC(int c) {
        validateSides(this.a, this.b, c);
        this.c = c;
    }

    private void validateSides(int a, int b, int c)
    {
        if (a + b < c || a + c < b || b + c < a)
        {
            throw new IllegalArgumentException
                    ("Impossible triangle to create! Review sides!");
        }
    }

    public int getTrianglePerimeter()
    {
        return a + b + c;
    }
}