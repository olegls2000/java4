package Model.D3;

import static Homework.L2Homework.getRandomNumberFromRange;

public class Paral implements Volume, SurfaceArea{
    private int l;
    private int h;
    private int w;

    public Paral()
    {
        this.l = getRandomNumberFromRange(4, 10);
        this.h = getRandomNumberFromRange(4, 10);
        this.w = getRandomNumberFromRange(4, 10);
    }

    @Override
    public double getSurfaceArea() {
        double surfaceArea = 2 * (l * h + h * w + w * l);
        return surfaceArea;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
