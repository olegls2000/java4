package model.geoShapes;

import java.util.Objects;

public class Triangle {
    private Point a; // x, y
    private Point b; // x, y
    private Point c; // x, y

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Triangle(Point a, Point b, Point c)
    {
        this.a = new Point(a.getX(), a.getY());
        this.b = new Point(b.getX(), b.getY());
        this.c = new Point(c.getX(), c.getY());
    }

    public double getTrianglePerimeter()
    {
        double ab = Math.abs(Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
                + Math.pow(a.getY() - b.getY(), 2)));
        double bc = Math.abs(Math.sqrt(Math.pow(b.getX() - c.getX(), 2)
                + Math.pow(b.getY() - c.getY(), 2)));
        double ca = Math.abs(Math.sqrt(Math.pow(c.getX() - a.getX(), 2)
                + Math.pow(c.getY() - a.getY(), 2)));
        isValidTriangle(ab, bc, ca);
        double result = ab + bc + ca;
        System.out.println("AB = " + ab + "\nBC = " + bc + "\nCA = " + ca);
        return result;
    }

    public void isValidTriangle(double ab, double bc, double ca)
    {
        boolean validTriangle = ab + bc > ca
                && bc + ca > ab
                && ca + ab > bc;
        if (!validTriangle)
        {
            throw new IllegalArgumentException
                    ("Impossible triangle to create! Review sides!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getA().equals(triangle.getA()) &&
                getB().equals(triangle.getB()) &&
                getC().equals(triangle.getC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    /*// TEACHER'S METHOD
    private Point a;//x, y
    private Point b;//x, y
    private Point c;//x, y

    public Triangle(Point a, Point b, Point c) {
        pointCheck(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        pointCheck(a, this.b, this.c);
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        pointCheck(this.a, b, this.c);
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        pointCheck(this.a, this.b, c);
        this.c = c;
    }

    public double getPerimeter() {
        //TODO ..
        return 0.0;
    }


    //(y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2)
    private void pointCheck(Point a, Point b, Point c) {
        if ((a.getY() - b.getY()) * (a.getX() - c.getX()) ==
                (a.getY() - c.getY()) * (a.getX() - b.getX())) {
            throw new IllegalArgumentException("Triangle impossible!!!");
        }
    }*/
}
// ALT + INSERT