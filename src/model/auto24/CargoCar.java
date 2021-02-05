package model.auto24;


import static utils.MyUtils.getRandomFromRange;

public class CargoCar extends AbstractCar implements model.auto24.Ratios {
    private String cargoCar = "Cargo car";
    private int liftingCapacity;
    protected int cargoCarPrice;

    public CargoCar()
    {

        this.cargoCar = cargoCar;
        this.liftingCapacity = getRandomFromRange(200, 1500);
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
