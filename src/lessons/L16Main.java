package lessons;


import model.Circle;

import java.util.*;

import static utils.MyUtils.generateList;


public class L16Main {
    public static void main(String[] args) {
        //Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> arrayList = new ArrayList<>(2);
        arrayList.add("RED");
        arrayList.add("WHITE");
        arrayList.add("BLACK");
        final String item1 = arrayList.get(0);

        System.out.println(arrayList);

        //Iteration through List Collection:
        for (String color : arrayList) {
            System.out.println(color);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Write a Java program to iterate through all elements in a array list via Iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        //Write a Java program to insert 10 element into the array list at the first position

        List<Integer> numbers = new LinkedList<>();
        numbers.add(0, 10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(1, 40);
        numbers.add(50);
        numbers.set(0, 66);
        System.out.println(numbers);

        List<Integer> integers = generateList(5, 0, 5);
        boolean contains6 = integers.contains(6);
        System.out.println("Contains 6: " + contains6);

        Integer removedUnderIndex8 = integers.remove(2);
        boolean removedValue8  = integers.remove(Integer.valueOf(3));

        Set<Circle> circlesSet = new HashSet<>();
        Circle circle1 = new Circle();
        circle1.setSide(5);

        Circle circle2 = new Circle();
        circle2.setSide(5);
        boolean one = circlesSet.add(circle1);
        boolean two =circlesSet.add(circle2);

        System.out.println(circlesSet);

    }

    // Generate collection with 10 integers,
    // find first even number and print it.

    //Find average in List Collection
}
