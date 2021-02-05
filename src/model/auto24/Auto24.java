package model.auto24;

public class Auto24 implements CarSalon {
    private final AbstractCar[] parkingLot = new AbstractCar[8];
    private long salonBalance;

    public int getParkingNumber(AbstractCar[] parkingLot) throws AutosalonNoFreePlaceException {
        int index = -1;
        for (int i = 0; i < parkingLot.length; i++) {
            if (parkingLot[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new AutosalonNoFreePlaceException("No free parking space!");
        }
        return index;
    }

    public Auto24(long storeBalance) {
        this.salonBalance = storeBalance;
    }

    @Override
    public int sellCar(int parkingNumber) {
        int carPrice;
        if (parkingLot.length >= parkingNumber && parkingLot[parkingNumber] != null) {
            carPrice = parkingLot[parkingNumber].getPrice();
            carPrice *= 1.20;
            salonBalance += carPrice;
            parkingLot[parkingNumber] = null;}
        return carPrice;
        }



    @Override
    public int buyCar(AbstractCar car) throws AutosalonNoMoneyException {
        int carPrice = car.getPrice();
        if (salonBalance >= carPrice) {
            try {
                parkingLot[getParkingNumber(parkingLot)] = car;
            } catch (AutosalonNoFreePlaceException e) {
                e.printStackTrace();
            }
            salonBalance -= carPrice;
            return carPrice;
        }else {
            throw new AutosalonNoMoneyException("No money in Auto24");
        }

            }



    @Override
    public void report() {
        for (int i = 0; i < parkingLot.length; i++) {
            if (parkingLot[i] != null) {
                System.out.println("Parking lot number: " + (i + 1) + ". Manufacturer: " + parkingLot[i].manufacturer
                        + ". Year of issue: " + parkingLot[i].dateOfIssue + ". Technical state: " + parkingLot[i].techState);
            }
        }
        System.out.println("Salon's balance: " + salonBalance);
    }
}