package model;

public interface CarSalon {
    int sellCar(int place);
    int buyCar(AbstractCar car);
    void report();
}
