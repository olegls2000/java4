package lessons;

import model.geoShapes.Circle;
import model.salonCar.CargoCar;
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
