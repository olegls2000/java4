package lessons;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            System.out.println(color);
        }

        //Write a Java program to iterate through all elements in a array list via Iterator
    }
}
