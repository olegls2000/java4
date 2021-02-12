package Lessons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static Lessons.MyUtils.generateList;
public class L16Main {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(2);
        arrayList.add("RED");
        arrayList.add("White");
        arrayList.add("Str");
        final String item1 = arrayList.get(0);

        System.out.println(arrayList);

        for (String Color : arrayList) {
            System.out.println(Color);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);

        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, 10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        List<Integer> integers = generateList(10, 0, 5);
        boolean contains6 = integers.contains(6);
        System.out.println("Contains 6 :" + contains6);

        Integer removedUnderIndex8 = integers.remove(8);
        boolean removedValue8 = integers.remove(Integer.valueOf(3));


        List<Integer> even = new ArrayList<>();
        int[] arList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arList.length; i++) {
            if (arList[i] % 2 == 0) {
                even.add(arList[i]);

            }
            System.out.println(arList[i]);
        }


    }



    }

