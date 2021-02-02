package model;

public class VehoSalon implements CarSalon {
    private final AbstractCar[] parking = new AbstractCar[8];
    private final int  place = 8;
    protected long balance;


    public VehoSalon(long balance) {
        this.balance = balance;
    }

    public VehoSalon() {
        
    }




    @Override
    public int sellCar(int place) {

        //TODO ..
        return 0;
    }

    @Override
    public int buyCar(AbstractCar car) {

        car.getPrice();


        return 0;
    }

    @Override
    public void report() {

    }

    public int getPrice() {
        return 0;
    }
}
