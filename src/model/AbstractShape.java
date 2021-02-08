package model;

import annotation.NumberCheck;

import static utils.MyUtils.getRandomFromRange;

public abstract class AbstractShape {

    @NumberCheck(min = 0, max = 10_000)
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
