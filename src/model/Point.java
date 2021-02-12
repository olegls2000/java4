package model;


public class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point z)
    {
        return Math.sqrt((this.x - z.x)*(this.x - z.x) + (this.y - z.y)*(this.y - z.y));
    }
}
