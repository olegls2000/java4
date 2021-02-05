package model.auto24;


import static utils.MyUtils.getRandomFromRange;

public class PassengerCar extends AbstractCar implements Ratios {
    private String passengerCar = "Cargo car";
    private int numberOfPassengerSeats;
    protected int passengerCarPrice;

    public PassengerCar()
    {
        /*this.year = year;
        this.month = month;
        this.day = day;*/
        this.passengerCar = passengerCar;
        this.numberOfPassengerSeats = getRandomFromRange(2, 8);
    }

    @Override
    public int getPrice() {
        this.passengerCarPrice = (numberOfPassengerSeats * PASSENGER_SEATS_RATIO)
                - (carAge * AGE_RATIO)
                + (techState * TECH_STATE_RATIO);
        return passengerCarPrice;
    }
}
