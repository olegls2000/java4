package lessons;


import pattern.*;

public class L9Main {
    public static void main(String[] args) {


        Body bodyForCar = new Body();
        System.out.println("Some logic");
        Engine engine = new Engine();


        Wheel wheel1 = new Wheel();
        Wheel[] wheels = {wheel1};
        Car newCar = new Car(bodyForCar, wheels, engine);
        Carbuilder build = new Carbuilder();
        build.body(new Body());

        Etv etv = new Etv();
        Subscriber postimees = new PostiMees();
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.publishForecast("+9");
        meteoStation.addSubscriber(new Delfi());//nevozmozno ydalit' ne ssqlki
        meteoStation.addSubscriber(etv);
        meteoStation.addSubscriber(postimees);
        meteoStation.publishForecast("-9");
        SingleTon object = SingleTon.getInstance();




    }
}
