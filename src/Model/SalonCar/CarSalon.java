package Model.SalonCar;

public interface CarSalon {
    int sellCar(int parkingNumber);
    int buyCar(AbstractCar car);
    void report();
}