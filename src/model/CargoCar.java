package model;

import java.time.LocalDate;

import static utils.MyUtils.getRandomFromRange;

public class CargoCar extends AbstractCar {
    private int liftingCapacity;

    public CargoCar() {
        super();
        this.liftingCapacity = getRandomFromRange(200, 1500);
    }

    @Override
    public int getPrice() {

        return (liftingCapacity * LOAD_RATIO)
                - (super.getAge() * AGE_RATIO)
                + (techState * TECH_STATE_RATIO);
    }
}
