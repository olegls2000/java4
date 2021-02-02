package model;

import java.util.GregorianCalendar;

import static model.CarSalon.*;
import static utils.MyUtils.getRandomFromRange;

public class PassangerCar extends AbstractCar{

    protected Integer seats;

    public PassangerCar(Integer data, Integer tO, String brand, Integer seats) {
        super(data, tO, brand);
        this.seats = getRandomFromRange(2, 8);
    }

    @Override
    public int getPrice() {
        return seats*K_P_SEATS-K_VOZRAST*data+K_TO*tO;
    }

}

