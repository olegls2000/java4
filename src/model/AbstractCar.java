package model;

import utils.MyUtils.*;


import static utils.MyUtils.getRandomFromRange;
import static utils.MyUtils.getRandomItem;

public abstract class AbstractCar {
    protected Integer data;
    protected Integer tO;
    protected String brand;


    public AbstractCar(Integer data, Integer tO, String brand) {
        this.data = getRandomFromRange(1960, 2020);
        this.tO = getRandomFromRange(1, 106);
        this.brand = getRandomItem(new String[]{"Honda", "Mercedes", "BMW", "Toyota"});

    }

    public abstract int getPrice();

}




