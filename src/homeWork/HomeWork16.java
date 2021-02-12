package homeWork;

import java.util.*;

public class HomeWork16 {
    public static void main(String[] args){
        //Write a Java program to search an element in a array list.
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("raz");
        arrayList.add("dva");
        arrayList.add("tri");
        final String raz = arrayList.get(0);
        System.out.println(raz);
        if (arrayList.contains("dva")) {
            System.out.println("Tq nawel menja");
        } else {
            System.out.println("iwi ly4we");
        }

       // Write a Java program to copy one array list into another.copyOf
        List<String> arrayListCopy = new ArrayList<String>(2);
        arrayListCopy.add("TT");
        Collections.copy(arrayList,arrayListCopy);
        System.out.println(arrayListCopy);
        ArrayList<String> arrayCopy2 = (ArrayList<String>) ((ArrayList<String>) arrayList).clone();
        System.out.println("Copy" + arrayCopy2);
        //Write a Java program to shuffle elements in a array list.
        Collections.shuffle(arrayCopy2);
        System.out.println("Shuffle" + arrayCopy2);
       // Write a Java program to reverse elements in a array list.
        Collections.reverse(arrayList);
        System.out.println("Reverse" + arrayList);
        //Write a Java program to extract a portion of a array list
        List<String> extractArray = arrayList.subList(2, 2);
        System.out.println("Extract" + extractArray);
        //Write a Java program to compare two array lists.
        List<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("11");
        arrayList2.add("22");
        arrayList2.add("33");
        arrayList2.add("raz");
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
        //Write a Java program of swap two elements in an array list.
        Collections.swap(arrayList,0,1);
        System.out.println(arrayList);
        //Write a Java program to join two array lists
        ArrayList<String> arrayListAll = new ArrayList<String>();
        arrayListAll.addAll(arrayList);
        arrayListAll.addAll(arrayList2);
        System.out.println(arrayListAll);
        //Write a Java program to empty an array list.
        arrayListAll.removeAll(arrayListAll);
        arrayListAll.clear();
        System.out.println(arrayListAll);
        //Write a Java program to test an array list is empty or not.
        arrayListAll.isEmpty();
        for (String entry : arrayListAll) {
            if(entry == null){
                System.out.println("Empty list");
            }else{
                System.out.println("Not empty");
            }
        }
        System.out.println((((arrayListAll.isEmpty()))));
        //Write a Java program to trim the capacity of an array list the current list size.
        ((ArrayList<String>) arrayList).trimToSize();
        //Write a Java program to increase the size of an array list.
        ((ArrayList<String>) arrayList).ensureCapacity(10);
        System.out.println(arrayList);
//Write a Java program to replace the second element of a ArrayList with the specified element.
        arrayList.set(1,"new_raz");
        System.out.println(arrayList);
//Write a Java program to print all the elements of a ArrayList using the position of the elements.
        int vse = arrayList2.size();
        for (int index = 0; index < vse; index++)
        System.out.println(arrayList2.get(index));


    }
}
