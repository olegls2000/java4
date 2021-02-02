package model.d3;

import static utils.MyUtils.getRandomFromRange;

public class Parallelepiped implements WithVolume, WithSurfaceArea {
    private int l;//4-10
    private int h;//4-10
    private int w;//4-10

    public Parallelepiped() {
        this.l = getRandomFromRange(4, 10);
        this.h = getRandomFromRange(4, 10);
        this.w = getRandomFromRange(4, 10);
    }

    @Override
    public double getSurfaceArea() {
        return 2 * l * h + 2 * h * w + 2 * l * w;
    }

    @Override
    public double getVolume() {
        return l * h * w;
    }
}
