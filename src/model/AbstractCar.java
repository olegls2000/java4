package model;

import annotation.NumberCheck;

import java.time.*;
import java.util.Date;

public abstract class AbstractCar {

    private Color color;

    public Color getColor() {
        return color;
    }

    public AbstractCar() {

        color = Color.values()[2];
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @NumberCheck(min = 1990, max = 2019)
    protected int year; //2010

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

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufactureYear(LocalDate manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
}
