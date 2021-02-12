package Lessons;

import HierarchyEmp.CargoCar;
import Processor.NumberCheckProcessor;
import model.Circle;

public class L15Main {

    public static void main(String[] args) {
        NumberCheckProcessor numberCheckProcessor= new NumberCheckProcessor();



        Circle circle = new Circle();
        circle.setSide(0);
        numberCheckProcessor.process(circle);


        CargoCar car = new CargoCar(1995,2000,"honda ",20);

        numberCheckProcessor.process(car);
    }
}
