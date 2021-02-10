package model.salonCar;

import annotation.Profiler;
import exception.UnavailableCarException;
import exception.UnavailableParkingSpaceException;
import exception.ZeroBalanceException;

public class TopAuto implements CarSalon {
    private final AbstractCar[] parkingLot = new AbstractCar[8];
    private long salonBalance;

    public int getParkingNumber(AbstractCar[] parkingLot)
            throws UnavailableParkingSpaceException {
        int index = -1;
        for (int i = 0; i < parkingLot.length; i++)
        {
            if (parkingLot[i] == null)
            {
                index = i;
                break;
            }
        }
        if (index == -1)
        {
            throw new UnavailableParkingSpaceException("No available parking space!");
        }
        return index;
    }

    public TopAuto(long storeBalance)
    {
        this.salonBalance = storeBalance;
    }

    @Override
    public int sellCar(int parkingNumber)
            throws UnavailableCarException {
        int carPrice;
        if (parkingLot.length >= parkingNumber && parkingLot[parkingNumber] != null)
        {
            carPrice = parkingLot[parkingNumber].getPrice();
            carPrice *= 1.20;
            salonBalance += carPrice;
            parkingLot[parkingNumber] = null;
        }
        else
        {
            throw new UnavailableCarException("No available car under this parking space!");
        }
        return carPrice;
    }

    @Override
    public int buyCar(AbstractCar car)
            throws ZeroBalanceException, UnavailableParkingSpaceException {
        int carPrice = car.getPrice();
        if (salonBalance >= carPrice)
        {
            parkingLot[getParkingNumber(parkingLot)] = car;
            salonBalance -= carPrice;
            return carPrice;
        }
        else
        {
            throw new ZeroBalanceException("Not enough balance for purchase!");
        }
    }

    @Override
    @Profiler
    public void report() {
        for (int i = 0; i < parkingLot.length; i++)
        {
            if (parkingLot[i]!= null)
            {
                System.out.println("Parking lot number: " + (i + 1) + ". Manufacturer: " + parkingLot[i].manufacturer
                        + ". Year of issue: " + parkingLot[i].dateOfIssue + ". Technical state: " + parkingLot[i].techState);
            }
        }
        System.out.println("Salon's balance: " + salonBalance);
    }
}