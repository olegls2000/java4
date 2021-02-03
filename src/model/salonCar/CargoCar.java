package model.salonCar;

import static homework.L2Homework.getRandomNumberFromRange;

public class CargoCar extends AbstractCar implements Ratios {
    private String cargoCar = "Cargo car";
    private int liftingCapacity;
    protected int cargoCarPrice;

    public CargoCar()
    {
        /*this.year = year;
        this.month = month;
        this.day = day;*/
        this.cargoCar = cargoCar;
        this.liftingCapacity = getRandomNumberFromRange(200, 1500);
    }

    @Override
    public int getPrice()
    {
        this.cargoCarPrice = (liftingCapacity * LOAD_RATIO)
                - (carAge * AGE_RATIO)
                + (techState * TECH_STATE_RATIO);
        return cargoCarPrice;
    }
}
