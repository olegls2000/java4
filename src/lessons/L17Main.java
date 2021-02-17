package lessons;

import collection.MyQueue;
import comparator.StudentGradeComparator;
import model.Student;
import model.geoShapes.*;
import model.salonCar.AbstractCar;
import model.salonCar.CargoCar;
import model.salonCar.PassengerCar;
import model.workers.Director;

import java.util.*;

public class L17Main {
    public static void main(String[] args) {
        /*Set<Circle> circlesSet = new HashSet<>();
        Circle circle1 = new Circle();
        circle1.setSide(5);
        System.out.println(circle1.hashCode());

        Circle circle2 = new Circle();
        circle2.setSide(5);
        System.out.println(circle2.hashCode());
        boolean one = circlesSet.add(circle1);
        boolean two = circlesSet.add(circle2);
        System.out.println(circlesSet);

        Map<Long, String> myMap = new HashMap<>();
        // Map<? extends AbstractShape, String> myMap = new HashMap<>();
        String value1 = myMap.put(Long.valueOf(1l), "Value1");
        String value2 = myMap.put(Long.valueOf(2l), "Value2");
        String searchValue = myMap.get("T"); // searching key

        ///////////////////////////////////////////////////////////////
        Map<Double, AbstractShape> perimeterVsShapes = new HashMap<>();
        Square square = new Square();
        EqSideTriangle triangle = new EqSideTriangle();
        Circle circle = new Circle();
        perimeterVsShapes.put(square.getPerimeter(), square);
        perimeterVsShapes.put(triangle.getPerimeter(), triangle);
        perimeterVsShapes.put(circle.getPerimeter(), circle);
        System.out.println(perimeterVsShapes);

        Set<Double> keys = perimeterVsShapes.keySet();
        Double maxPerimeter = keys.iterator().next(); // first to get
        for (Double perimeter : keys) {
            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
            }
        }
        AbstractShape maxPerimeterShape = perimeterVsShapes.get(maxPerimeter);
        System.out.println(maxPerimeterShape);

        final Set<Map.Entry<Double, AbstractShape>> entrySet = perimeterVsShapes.entrySet();
        Map.Entry<Double, AbstractShape> entryWithMaxPerimeter = entrySet.iterator().next();
        for (Map.Entry<Double, AbstractShape> entry : entrySet) {
            if (entry.getKey() > entryWithMaxPerimeter.getKey()) {
                entryWithMaxPerimeter = entry;
            }
        }
        Double maxPerim = entryWithMaxPerimeter.getKey();
        AbstractShape maxPerimShape = entryWithMaxPerimeter.getValue();
        final Collection<AbstractShape> values = perimeterVsShapes.values();

        //////////////////////////////////////////////////////////////
        Map<Double, AbstractCar> pricesOfCars = new HashMap<>();
        CargoCar cargo1 = new CargoCar();
        CargoCar cargo2 = new CargoCar();
        PassengerCar passenger1 = new PassengerCar();
        PassengerCar passenger2 = new PassengerCar();
        pricesOfCars.put(Double.valueOf(cargo1.getPrice()), cargo1);
        pricesOfCars.put(Double.valueOf(cargo2.getPrice()), cargo1);
        pricesOfCars.put(Double.valueOf(passenger1.getPrice()), cargo1);
        System.out.println(pricesOfCars);

        Set<Double> carKeys = pricesOfCars.keySet();
        Double highestCarPrice = keys.iterator().next();
        for (Double carPrice : carKeys) {
            if (carPrice > highestCarPrice) {
                highestCarPrice = carPrice;
            }
        }
        AbstractCar carWithHighestPrice = pricesOfCars.get(highestCarPrice);
        System.out.println(carWithHighestPrice);
        //////////////////////////////////////////////////////////////

        Map<Long, String> treeMap = new TreeMap<>();
        treeMap.put(Long.valueOf(1l), "Tree");
        treeMap.put(Long.valueOf(2l), "Tree2");

        Map<Circle, String> treeMapCircle = new TreeMap<>();
        treeMapCircle.put(new Circle(), "1");
        treeMapCircle.put(new Circle(), "2");

        String value = treeMap.get(new Circle());
        //////////////////////////////////////////////////////////////

        Student student1 = new Student("Anna", "First", 18, 3.4);
        Student student2 = new Student("Bob", "Second", 25, 6.9);
        Student student3 = new Student("Mike", "Third", 35, 10.2);
        TreeSet<Student> averageGradeSet = new TreeSet<>(new StudentGradeComparator());
        averageGradeSet.add(student1);
        averageGradeSet.add(student2);
        averageGradeSet.add(student3);
        Student highestAverageGrade = averageGradeSet.last();
        // create through for/if loops
        System.out.println(highestAverageGrade.name);*/

        // ----------------------------------------------- QUEUE
        Queue<Circle> myQueue = new MyQueue<>();

        Circle circle11 = new Circle(1);
        myQueue.add(circle11);
        Circle circle22 = new Circle(2);
        myQueue.add(circle22);
        Circle circle33 = new Circle(3);
        myQueue.add(circle33);
        Circle circle44 = new Circle(4);
        myQueue.add(circle44);

        System.out.println(myQueue);

        System.out.println(myQueue.contains(null));
        System.out.println(myQueue);

        // Empty Queue
        Queue<Circle> myQueueForErrors = new MyQueue<>();
    }
}
