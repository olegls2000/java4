package model;

import static utils.MyUtils.getRandomFromRange;
import annotation.NumberCheck;

public abstract class AbstractShape {

    @NumberCheck(min = 0,max = 10000)
    protected int side;

    public AbstractShape() {
        this.side = getRandomFromRange(2, 10);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public abstract double getPerimetr();


}
