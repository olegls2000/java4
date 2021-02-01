package model.d3;

import static utils.MyUtils.getRandomFromRange;

public class Cylinder implements WithVolume, WithSurfaceArea {
    private int radius; //3-10
    private int h;//3-10

    public Cylinder() {
        this.radius = getRandomFromRange(3, 10);
        this.h = getRandomFromRange(3, 10);
    }

    @Override
    public double getSurfaceArea() {
        return 2 * PI * radius * h + 2 * PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return PI * radius * radius * h;
    }
}
