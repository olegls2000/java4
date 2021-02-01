package model;

import java.util.Objects;

public class Triangle {
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

    public double getPerimetr() {
        //TODO ..
        return 0.0;
    }


    //(y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2)
    private void pointCheck(Point a, Point b, Point c) {
        if ((a.getY() - b.getY()) * (a.getX() - c.getX()) ==
                (a.getY() - c.getY()) * (a.getX() - b.getX())) {
            throw new IllegalArgumentException("Triangle impossible!!!");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getA().equals(triangle.getA()) && getB().equals(triangle.getB()) && getC().equals(triangle.getC());
    }


}