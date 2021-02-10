package lessons;

import model.Circle;

import java.util.*;

import static utils.MyUtils.generateList;
import static utils.MyUtils.getRandomFromRange;


public class L16Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(2);
        arrayList.add("RED");
        arrayList.add("WHITE");
        arrayList.add("BLACK");
        final String item1 = arrayList.get(0);

        System.out.println(arrayList);

        for (String color : arrayList) {
            System.out.println(color);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        Iterator<String> itterator = arrayList.iterator();
        while (itterator.hasNext()) {
            String color = itterator.next();
            System.out.println(color);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, 10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(1, 40);
        numbers.add(50);
        numbers.set(0, 66);
        System.out.println(numbers);

        List<Integer> integers = generateList(10, 0, 5);
        boolean contains6 = integers.contains(6);
        System.out.println("Contains 6: " + contains6);

        Integer removeUnderIndex8 = integers.remove(8);
        boolean removedValue8 = integers.remove(Integer.valueOf(8));

        Set<Circle> circleSet = new HashSet<>();
        Circle circle1 = new Circle();
        circle1.setSide(5);

        Circle circle2 = new Circle();
        circle1.setSide(5);

        circleSet.add(circle1);
        circleSet.add(circle2);

        List<Integer> firstEven = new ArrayList<>();
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));
        firstEven.add(getRandomFromRange(1, 1000));

        for (int i = 0; i < firstEven.size(); i++) {
            if (firstEven.get(i) % 2 == 0) {
                System.out.println(firstEven.get(i));
                break;
            }

        }


    }
}
