package lessons;

import model.Circle;
import pattern.*;

public class L9Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.body(new Body());
        System.out.println("some logic");
        System.out.println("some calculation");
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
        builder.engine(new Engine()).wheels(new Wheel[]{wheel1, wheel2, wheel3, wheel4});
        someMeth(builder);
        Singleton instance1 = Singleton.getInstance();
       /* instance1.varInst = "1";
        Singleton.var = "UU";*/
        Singleton instance2 = Singleton.getInstance();
       /* instance2.varInst = "2";
        Singleton.var = "UUX";*/
        Singleton instance3 = Singleton.getInstance();
      /*  instance3.varInst = "3";
        Singleton.var = "UUY";*/

        Postimees postimees = new Postimees();
        Subscriber postimees2 = new Postimees();

        MeteoStation meteoStation = new MeteoStation();
        meteoStation.publishForecast("+9C");
        meteoStation.addSubscriber(postimees);
        meteoStation.addSubscriber(postimees2);
        meteoStation.publishForecast("+8C");
        meteoStation.addSubscriber(new Etv());
        meteoStation.addSubscriber(new Delfi());
        meteoStation.publishForecast("+5C");
        meteoStation.addSubscriber(new Subscriber() {
            @Override
            public void notifyMe(String forecast) {
                System.out.println("Unknown subscriber is here. And this is the Forecast: " + forecast);
            }
        });
        meteoStation.publishForecast("+3C");
        meteoStation.removeSubscriber(postimees);
        meteoStation.removeSubscriber(postimees2);
        meteoStation.publishForecast("+2C");

        String str1 = "Hello";
        String str2 = "Hello";
        String strN = new String("Hello");

        if (str1 == str2) {
            System.out.println("Eq");//+
        } else {
            System.out.println("Not Eq");
        }

        if (str1 == strN) {
            System.out.println("Eq");
        } else {
            System.out.println("Not Eq");//+
        }

        if (str1.equals(strN)) {
            System.out.println("Eq");//+
        } else {
            System.out.println("Not Eq");
        }

        Circle circle1 = new Circle();
        circle1.setSide(5);
        Circle circle2 = new Circle();
        circle2.setSide(5);
        if (circle1 == circle2) {
            System.out.println("Circles -> Eq");
        } else {
            System.out.println("Circles -> Not Eq");
        }

        if (circle1.equals(circle2)) {
            System.out.println("Circles -> Eq");
        } else {
            System.out.println("Circles -> Not Eq");
        }


//        String result = str == strN ? "Equal" : "Not Equal";
//        System.out.println(result);

    }

    private static void someMeth(CarBuilder carBuilder) {
        Car newCar = carBuilder.build();
    }

}
