package model.salonCar;

import exception.UnavailableCar;
import exception.UnavailableParkingSpace;
import exception.ZeroBalance;

public interface CarSalon {
    int sellCar(int parkingNumber) throws UnavailableParkingSpace, UnavailableCar;
    int buyCar(AbstractCar car) throws ZeroBalance, UnavailableParkingSpace;
    void report();
}