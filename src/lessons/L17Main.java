package lessons;

import collection.MyQueue;
import comparator.DirectorAgeComparator;
import comparator.DirectorSalaryComparator;
import model.AbstractShape;
import model.Circle;
import model.Director;
import model.EqSideTriangle;

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
        String value3 = myMap.put(Long.valueOf(1l), "Value3");


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
        Double maxPerimetr = keys.iterator().next();

        for (Double perimetr : keys) {
            if (perimetr > maxPerimetr) {
                maxPerimetr = perimetr;
            }
        }
        AbstractShape maxPerimShape = perimetrsVsShapes.get(maxPerimetr);
        System.out.println(maxPerimShape);

        final Set<Map.Entry<Double, AbstractShape>> entrySet = perimetrsVsShapes.entrySet();


        Iterator<   Map.Entry<Double, AbstractShape>      > iterator  = entrySet.iterator();
        Map.Entry<Double, AbstractShape> entryWithMaxPerim = iterator.next();

        for (Map.Entry<Double, AbstractShape> entry : entrySet) {
            if (entry.getKey() > entryWithMaxPerim.getKey()) {
                entryWithMaxPerim = entry;
            }
        }

        Double maxPerim = entryWithMaxPerim.getKey();
        AbstractShape maxPerimShapeX = entryWithMaxPerim.getValue();

        final Collection<AbstractShape> values = perimetrsVsShapes.values();


        Map<Long, String> treeMap = new TreeMap<>();
        treeMap.put(Long.valueOf(1L), "Tree");
        treeMap.put(Long.valueOf(2L), "Tree2");
        treeMap.put(Long.valueOf(-2L), "Tree2");

        Map<Circle, String> treeMapCircle = new TreeMap<>();
        treeMapCircle.put(new Circle(), "One");
        treeMapCircle.put(new Circle(), "Two");
        treeMapCircle.put(new Circle(), "Three");
        treeMapCircle.put(new Circle(), "Four");


        //String value = treeMap.get(new Circle());

        Director director = new Director("Joe", "Biden", 78, 500l, "TT");
        Director director1 = new Director("Joe1", "Biden1", 79, 600l, "TT");
        DirectorSalaryComparator directorSalaryComparator = new DirectorSalaryComparator();
        TreeSet<Director> directorSet = new TreeSet<>(directorSalaryComparator);
        //Set<Director> directorSet = new TreeSet<>();
        directorSet.add(director);
        directorSet.add(director1);

        Director highestSalary  = directorSet.first();

        TreeSet<Director> ageSortedSet = new TreeSet<>(new DirectorAgeComparator());
        ageSortedSet.add(director);
        ageSortedSet.add(director1);
        Director highestAge  = ageSortedSet.last();

        Queue<Circle> circleQueue = new MyQueue<>();
        System.out.println(circleQueue.size());
        System.out.println(circleQueue.isEmpty());
        circleQueue.add(new Circle());









    }
}
