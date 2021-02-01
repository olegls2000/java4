package Lessons;

import Pattern.*;

public class L9Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.body(new Body());
        System.out.println("Some logic");
        System.out.println("Some math");

        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
        builder.engine(new Engine()).
                wheels(new Wheel[]{wheel1, wheel2, wheel3, wheel4});
        someMethod(builder);

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        Postimees postimees = new Postimees();
        Subscriber postimeesSub = new Postimees();


        MeteoStation meteoStation = new MeteoStation();
        meteoStation.publishForecast("+9C");
        meteoStation.addSubscriber(postimees);
        meteoStation.addSubscriber(postimeesSub);
        meteoStation.publishForecast("+8C");

        meteoStation.addSubscriber(new Delfi()); //bad practice, can't be removed
        meteoStation.addSubscriber(new ETV());

        meteoStation.publishForecast("+5C");

        meteoStation.addSubscriber(new Subscriber() {
            @Override
            public void notifyMe(String forecast) {
                System.out.println("Unknown subscriber is here. And this is the Forecast: " + forecast);
            }
        });
        meteoStation.publishForecast("+3C");
        meteoStation.removeSubscriber(postimees);
        meteoStation.removeSubscriber(postimeesSub);
        meteoStation.publishForecast("+2C");

        String string = "Hello";
        String string1 = new String("Hello");

        System.out.println(string == string1 ? "Equal" : "Not equal"); //ternary oper.
        // Returns Not Equal, because == compares two different object (сравнивает ссылки)
        // equals. compares content (inside object)

        // String str1 = "Hello", String str2 = "Hello" PULL указывают на один объект
        // HEAP сравнивает контент 


    }

    private static void someMethod(CarBuilder carBuilder)
    {
        Car newCar = carBuilder.builder();
    }
}

/*
    Change date of issue (month and day).

        If selling cat num 3, sells car num 4.

        Finish all previous homework

        Job interview:
        Patterns
        Object methods
        OOP princips*/
