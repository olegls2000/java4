package lessons;

import model.geoShapes.Circle;

import java.util.*;

import static utils.MyUtils.generateIntegerList;
import static utils.MyUtils.getRandomFromRange;

public class L16Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<String>(2);
        colorList.add("Red");
        colorList.add("Yellow");
        colorList.add("Blue");
        final String item1 = colorList.get(0);

        // Printing out
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(colorList.get(i));
        }
        for (String color : colorList){
            System.out.println(color);
        }

        Iterator<String> iterator = colorList.iterator(); // pattern realization
        while (iterator.hasNext()) {
            // String color = iterator.next();
            System.out.println(iterator.next());
        }

        List<Integer> numbersList = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int number = getRandomFromRange(10, 100);
            numbersList.add(number);
            sum += number;
            if (number % 2 == 0) {
                System.out.println(number);
                break;
            }
        }
        sum = sum / numbersList.size();
        System.out.println(numbersList);
        System.out.println("Arithmetic average: " + sum);

        // new

        List<Integer> integers = generateIntegerList(10, 0, 5);
        boolean contains6 = integers.contains(6);
        System.out.println("Contains 6: " + contains6);
         Integer removeUnderIndex8 = integers.remove(8); // by index
         boolean removeValue8 = integers.remove(Integer.valueOf(8)); // by value

        // Set

        Set<Circle> circlesSet = new HashSet<>();
        Circle circle1 = new Circle();
        circle1.setSide(5);

        Circle circle2 = new Circle();
        circle2.setSide(5);
        boolean one = circlesSet.add(circle1);
        boolean two = circlesSet.add(circle2);
        System.out.println(circlesSet);

    }
}