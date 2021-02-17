package model.geoShapes;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Circle extends AbstractShape implements Shape, Comparable {

    public Circle() {
    }

    public Circle(int side) {
        this.side = side;
    }

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

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }

    @Override
    public int compareTo(Circle o) {
        return (int) (this.getPerimeter() - o.getPerimeter());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
// abstract --> ought to happen
