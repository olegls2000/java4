package model;

import java.time.*;
import java.util.Date;

public abstract class AbstractCar {
    private int year; //2010
    protected LocalDate manufactureYear;

    //private Date manufactureDate; //before 1.8
   /* private LocalTime localTime = LocalTime.of(20,30,50, 60);
    private LocalTime openFrom = LocalTime.of(8,00);
    private LocalTime openTill = LocalTime.of(18,00);
    private LocalDate birthday = LocalDate.of(2000, Month.FEBRUARY, 30);
    private LocalDateTime localDateTime = LocalDateTime.of(2000, Month.FEBRUARY, 30,20,30,50, 60 );
    private LocalDateTime localDateTimeX = LocalDateTime.of(birthday, openTill );
    private ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTimeX, ZoneId.systemDefault());*/

    public abstract int getPrice();
}
