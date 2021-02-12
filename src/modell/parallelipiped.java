package modell;
import static Lessons.MyUtils.getRandomFromRange;
public class parallelipiped implements WithVolume, WithSurfaceArea {
    private int l;
    private int h;
    private int w;


    parallelipiped(){
        this.l=(getRandomFromRange(4,10));
        this.h=(getRandomFromRange(4,10));
        this.l=(getRandomFromRange(4,10));
    }
    @Override
    public double getSurfaceArea() { {
        return 2 * l * h + 2 * h * w + 2 * l * w;
    }

    }

    @Override
    public double getVolume() {
        {
            return l * h * w;
        }
    }
}
