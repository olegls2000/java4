package model;

import static utils.MyUtils.getRandomFromRange;

public abstract class AbstractShape {
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
