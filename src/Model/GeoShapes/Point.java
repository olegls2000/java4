package Model.GeoShapes;

import static Homework.L2Homework.getRandomNumberFromRange;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int setX(int x)
    {
        this.x = x;
        return x;
    }

    public int setY(int y)
    {
        this.y = y;
        return y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    /*public int getRandomX()
    {
        x = getRandomNumberFromRange(-10, 10);
        return x;
    }

    public int getRandomY()
    {
        y = getRandomNumberFromRange(-10, 10);
        return y;
    }*/

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof Point)
        {
            final Point objPoint = (Point) obj;
            return this.x == objPoint.getX() && this.y == objPoint.getY();
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
