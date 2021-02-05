package model.auto24;

public interface CarSalon {
    int sellCar(int parkingNumber) throws AutosalonNoFreePlaceException;
    int buyCar(AbstractCar car) throws AutosalonNoMoneyException;
    void report();
}