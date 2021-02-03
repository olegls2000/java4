package model.d3;

import static homework.L2Homework.getRandomNumberFromRange;

public class Sphere implements Volume, SurfaceArea {
    private int r;

    public Sphere()
    {
        this.r = getRandomNumberFromRange(5, 10);
    }

    @Override
    public double getSurfaceArea() {
        double surfaceArea = 4 * CONST_PI * Math.pow(r, 2);
        return surfaceArea;
    }

    @Override
    public double getVolume() {
        double volume = (4/3) * CONST_PI * Math.pow(r, 3);
        return volume;
    }
}