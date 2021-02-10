package model.salonCar;

import processor.ProfilerProcessor;

public class Loader {
    public static void main(String[] args)
            throws Exception {
        CarSalon topAuto = new TopAuto(300_000);
        //topAuto.report();
        /*System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar(1999, 3, 11)));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar(2002, 10, 13)));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar(2005, 8, 2)));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new CargoCar(1994, 2, 22)));
        topAuto.report();*/
        ProfilerProcessor profilerProcessor = new ProfilerProcessor();
        profilerProcessor.process(topAuto);

        System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar()));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar()));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new PassengerCar()));
        System.out.println("Car bought, price: "
                + topAuto.buyCar(new CargoCar()));

        topAuto.report();
        System.out.println("Car sold, price: "
                + topAuto.sellCar(2));
        topAuto.report();
    }
}