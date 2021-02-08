package lessons;

import model.CargoCar;
import model.Circle;
import processor.NumberCheckProcessor;

public class L15Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        NumberCheckProcessor numberCheckProcessor = new NumberCheckProcessor();

        Circle circle = new Circle();
        //circle.setSide(0);
        numberCheckProcessor.process(circle);

        CargoCar car = new CargoCar();
        car.setYear(2000);
        numberCheckProcessor.process(car);

        long stop = System.currentTimeMillis();
        long duration = stop - start;
        System.out.println("Time = " + duration + " msec");
    }
}
