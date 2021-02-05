package model.auto24;

public interface CarSalon {
    int sellCar(int parkingNumber);
    int buyCar(AbstractCar car) throws AutosalonNoMoneyException;
    void report();
}