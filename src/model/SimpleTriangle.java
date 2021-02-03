package model;

import exeption.InvalidTriangleException;

public class SimpleTriangle {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) throws InvalidTriangleException {
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

    public void setA(int a)throws InvalidTriangleException {
        validateSides(a, this.b, this.c);
        this.a = a;
    }

    public void setB(int b) throws InvalidTriangleException{
        validateSides(this.a, b, this.c);
        this.b = b;
    }

    public void setC(int c) throws InvalidTriangleException {
        validateSides(this.a, this.b, c);
        this.c = c;
    }

    public int getPerim() {
        return a + b + c;
    }

    private void validateSides(int a, int b, int c) throws InvalidTriangleException {
        if (a + b < c || a + c < b || b + c < a) {
            throw new InvalidTriangleException("Impossible to create Triangle! Review sides!");
            //throw new IllegalArgumentException("Impossible to create Triangle! Review sides!");
        }
    }
}
