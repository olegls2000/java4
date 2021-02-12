package Homeworks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework16 {
    public static void main(String[] args) {
        List<Integer> even = new ArrayList<>();
        int[] arList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arList.length; i++) {
            if (arList[i] % 2 == 0) {
                even.add(arList[i]);
                System.out.print(arList[i] + ",");

            }
        }
        System.out.println();
        List<String> list = new ArrayList<>();
        list.add("Matvey");
        list.add("Timur");
        list.add("Itan");
        list.add("Denis");
        list.add("Atrjom");

        list.set(2, "Timurrrrr");
        System.out.println(list.get(2));


        int index = list.indexOf("Matvey");
        System.out.println(list.get(index) + " Index = " + index);


        if (list.isEmpty()) {
            System.out.println("is empty");
        } else {
            System.out.println("not empty");
        }


        List<String> list2 = new ArrayList<>();
        list.add("Katerina");
        list.add("Julia");
        list.add("Jelena");
        list.add("Irina");
        list.add("Anna");

        List<String> newList = Stream.concat(list.stream(), list2.stream()).collect(Collectors.toList());
        newList.remove(2);
        System.out.println(newList);


        Collections.shuffle(newList);
        System.out.println(newList);



        System.out.println();
        Iterator newListItr = newList.iterator();
        while (newListItr.hasNext()) {
            System.out.print(" , " + newListItr.next() );
        }

        System.out.println("\n" +"Reverse elements : ");

        ArrayList<String> listReverse = new ArrayList<>();

        for (int i = newList.size(); i > 0; i--) {
            listReverse.add(newList.size() - i, newList.get(i - 1));

        }
        for (String listRev : listReverse) {

            System.out.print(" ," + listRev);
        }


System.out.println();

        list.clear();

        if (list.isEmpty()) {
            System.out.println("is empty");
        } else {
            System.out.println("not empty");
        }
        }
    }
