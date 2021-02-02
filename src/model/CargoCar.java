package model;

import static model.CarSalon.*;
import static utils.MyUtils.getRandomFromRange;

import java.util.GregorianCalendar;

public class CargoCar extends AbstractCar{


    protected Integer weight;

    public CargoCar(Integer data, Integer tO, String brand, Integer weight) {
        super(data, tO, brand);
        this.weight = getRandomFromRange(200, 1500);
    }

    @Override
    public int getPrice() {
        return weight * K_GRYZ - K_VOZRAST * data + K_TO * tO;

    }

}
