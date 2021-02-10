package lessons;

import model.CargoCar;
import model.Circle;
import processor.NumberCheckProcessor;

public class L15Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        NumberCheckProcessor numberCheckProcessor = new NumberCheckProcessor();
        numberCheckProcessor.process(circle);


        CargoCar car = new CargoCar();
        numberCheckProcessor.process(car);


    }
}
