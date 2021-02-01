package Model.D3;

import static Homework.L2Homework.getRandomNumberFromRange;

public class Cilinder implements Volume, SurfaceArea {
    private int radius;
    private int h;

    public Cilinder()
    {
        this.radius = getRandomNumberFromRange(3, 10);
        this.h = getRandomNumberFromRange(3, 10);
    }
    @Override
    public double getSurfaceArea() {
        double surfaceArea = 2 * CONST_PI * radius * h + 2
                * CONST_PI * Math.pow(radius, 2);
        return surfaceArea;
    }

    @Override
    public double getVolume() {
        double volume = CONST_PI * Math.pow(radius, 2) * h;
        return volume;
    }
}