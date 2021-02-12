package lessons;

import model.*;

import java.util.*;

public class L17Main {
    public static void main(String[] args) {
        Set<model.Circle> circlesSet = new HashSet<>();
        Circle circle1 = new Circle();
        circle1.setSide(5);

        Circle circle2 = new Circle();
        circle2.setSide(5);
        boolean one = circlesSet.add(circle1);
        boolean two = circlesSet.add(circle2);

        System.out.println(circlesSet);


        Map<Long, String> myMap = new HashMap<>();
        String value1 = myMap.put(Long.valueOf(1l), "Value1");
        String value2 = myMap.put(Long.valueOf(2l), "Value2");

        String lookupValue = myMap.get("T");
        String lookupValue1 = myMap.get(1L);

        Map<Double, AbstractShape> perimetrsVsShapes = new HashMap<>();
       // Square square = new Square();
        EqSideTriangle triangle = new EqSideTriangle();
        Circle circle = new Circle();
        //perimetrsVsShapes.put(square.getPerimetr(), square);
        perimetrsVsShapes.put(triangle.getPerimetr(), triangle);
        perimetrsVsShapes.put(circle.getPerimetr(), circle);
        System.out.println(perimetrsVsShapes);

        Set<Double> keys = perimetrsVsShapes.keySet();





    }
}
