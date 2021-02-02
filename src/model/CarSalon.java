package model;

public interface CarSalon {
    int sellCar(int place);
    int buyCar(AbstractCar car);
    void report();

    int K_GRYZ = 15;
    int K_VOZRAST = 8;
    int K_TO = 100;
    int K_P_SEATS = 150;


}
