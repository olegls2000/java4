package modell;

import static Lessons.MyUtils.getRandomFromRange;

public class Sphere implements WithVolume, WithSurfaceArea {
    private int r; //5-10

    public Sphere() {
        this.r = getRandomFromRange(5, 10);
    }

    @Override
    public double getVolume() {
        return (4 / 3) * PI * r * r * r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * r * r;
    }
}
