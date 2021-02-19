package model;

import annotation.NumberCheck;

import java.time.LocalDate;

import static utils.MyUtils.getRandomFromRange;

public abstract class AbstractCar {
    protected final static int LOAD_RATIO = 15;
    protected final static int AGE_RATIO = 8;
    protected final static int TECH_STATE_RATIO = 100;
    protected final static int PLACES_RATIO = 150;

    private Color color;

    public Color getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getAge(){
        return LocalDate.now().getYear() - year;
    }

    protected int techState;

    public AbstractCar() {
        int randomColorIndex = getRandomFromRange(0, Color.values().length - 1);
        color = Color.values()[randomColorIndex];
        year = getRandomFromRange(1990, 2019);
        techState = getRandomFromRange(1, 10);
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
