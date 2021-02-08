package model.salonCar;

import exception.UnavailableCarException;
import exception.UnavailableParkingSpaceException;
import exception.ZeroBalanceException;

public interface CarSalon {
    int sellCar(int parkingNumber) throws UnavailableCarException;
    int buyCar(AbstractCar car) throws ZeroBalanceException, UnavailableParkingSpaceException;
    void report();
}