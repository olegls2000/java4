package Modell;
import static Lessons.MyUtils.getRandomFromRange;
public class Celinder implements WithSurfaceArea,WithVolume {
    private int radius;
    private int h;

    Celinder(){
        this.radius=getRandomFromRange(1,9);
        this.h=getRandomFromRange(1,9);

    }

    @Override
    public double getSurfaceArea() {
        {
            return 2 * PI * radius * h + 2 * PI * radius * radius;
        }
    }

    @Override
    public double getVolume() {
        {
            return PI * radius * radius * h;
        }
    }
}
