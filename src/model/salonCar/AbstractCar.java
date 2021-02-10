package model.salonCar;

import annotation.NumberCheck;

import java.util.Calendar;

import static homework.L2Homework.getRandomNumberFromRange;
import static utils.MyUtils.getRandomString;

public abstract class AbstractCar {
    protected int carAge;
    protected int dateOfIssue;
    protected int techState;
    protected String manufacturer;
    @NumberCheck(min = 1990, max = 2019)
    protected int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    /*protected int year;
    protected int month;
    protected int day;
    protected LocalDate currentDate = LocalDate.now();
    protected LocalDate dateOfIssue = LocalDate.of(year, month, day);
    protected Period difference = Period.between(currentDate, dateOfIssue);*/

    private String[] manufacturers = {"Honda", "Mercedes", "BMW", "Toyota"};

    public AbstractCar()
    {
        /*this.carAge = difference.getYears();*//*
        this.dateOfIssue = dateOfIssue;*/
        this.dateOfIssue = getRandomNumberFromRange(1990, 2010);
        this.carAge = currentYear - dateOfIssue;
        this.techState = getRandomNumberFromRange(1, 10);
        this.manufacturer = getRandomString(manufacturers);
    }

    public abstract int getPrice();
}
