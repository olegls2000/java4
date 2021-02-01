package model;

import java.time.LocalDate;

public class CargoCar extends AbstractCar {
    //TODO ...

    @Override
    public int getPrice() {
        int age = LocalDate.now().getYear() - manufactureYear.getYear();

        //TODO ...
        return 0;
    }
}
