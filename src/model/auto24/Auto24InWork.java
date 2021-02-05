package model.auto24;

public class Auto24InWork {
    public static void main(String[] args) {
        CarSalon topAuto = new Auto24(20);
        topAuto.report();
        /*System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar(1999, 3, 11)));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar(2002, 10, 13)));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar(2005, 8, 2)));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new CargoCar(1994, 2, 22)));
        topAuto.report();*/
        try {
            System.out.println("Car bought, price: "
                    + topAuto.buyCar(new PassengerCar()));
        } catch (AutosalonNoMoneyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Car bought, price: "
                    + topAuto.buyCar(new PassengerCar()));
        } catch (AutosalonNoMoneyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Car bought, price: "
                    + topAuto.buyCar(new PassengerCar()));
        } catch (AutosalonNoMoneyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Car bought, price: "
                    + topAuto.buyCar(new CargoCar()));
        } catch (AutosalonNoMoneyException e) {
            e.printStackTrace();
        }
        topAuto.report();

        System.out.println("Car sold, price: "
                + topAuto.sellCar(3));

        topAuto.report();
    }
}