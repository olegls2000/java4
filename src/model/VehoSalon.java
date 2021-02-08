package model;

import annotation.Profiler;

public class VehoSalon implements CarSalon{
    private final AbstractCar [] parking = new AbstractCar[8];
    private long balance;

    public VehoSalon(long balance) {
        this.balance = balance;
    }

    @Override
    public int sellCar(int place) {

        //TODO ..
        return 0;
    }

    @Override
    public int buyCar(AbstractCar car) {
        //TODO ...
        return 0;
    }

    @Profiler
    @Override
    public void report() {

    }
}
