package homework;

import model.CarSalon;
import model.VehoSalon;
import processor.ProfilerProcessor;

public class L15MainHW {
    public static void main(String[] args) {
        ProfilerProcessor processor = new ProfilerProcessor();
        CarSalon salon = new VehoSalon(90000);
        processor.process(salon);
    }
}
