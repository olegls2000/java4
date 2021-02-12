package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {

    public static void printArrayList(List<?> arrayList) {
        for (Object item : arrayList){
            System.out.println(item);
        }
    }

    // 1 Write a Java program to search an element in an array list.
    public static void getElementFromList(List<?> arrayList, String element) { // унифицировать
        if (arrayList.contains(element)) {
            System.out.println("Element \"" + element + "\" is present in the current List.");
        }
        else {
            System.out.println("Element \"" + element + "\" is not found in the current List.");
        }
    }

    // 2 Write a Java program to copy one array list into another.
    public static<T> void getListCopy(List<T> firstList, List<T> secondList) {
        Collections.copy(firstList, secondList);
        System.out.println(firstList);
        System.out.println(secondList);
    }

    // 3 Write a Java program to shuffle elements in an array list.
    public static List<?> getShuffledList(List<?> list) {
        Collections.shuffle(list);
        return list;
    }

    // 4 Write a Java program to reverse elements in an array list.
    public static List<?> getReverseList(List<?> list) {
        Collections.reverse(list);
        return list;
    }

    // 5 Write a Java program to extract a portion of an array list.
    public static List<?> extractPortionOfList(List<?> list, int from, int to)
            throws Exception {
        if (from < 0 || to > list.size()) {
            throw new Exception("Incorrect input!");
        }
        List<?> extractedList = list.subList(from, to);
        return extractedList;
    }

    // 6 Write a Java program to compare two array lists.
    public static boolean compareTwoLists(List<?> firstList, List<?> secondList) {
        boolean compare = firstList.equals(secondList);
        return compare;
    }

    // 7 Write a Java program of swap two elements in an array list.
    public static List<?> swapTwoElementsInArrayList(List<?> list, int firstElement, int secondElement)
            throws Exception {
        if (firstElement < 0 || secondElement > list.size()) {
            throw new Exception("Incorrect input!");
        }
        Collections.swap(list, firstElement, secondElement);
        return list;
    }

    // 8 Write a Java program to join two array lists.
    public static<T> List<T> concatenateTwoLists(List<T> firstList, List<T> secondList) {
        List<T> concatenatedList = new ArrayList<>();
        concatenatedList.addAll(firstList);
        concatenatedList.addAll(secondList);
        return concatenatedList;
    }

    // 9 Write a Java program to empty an array list.
    public static List<?> getClearedList(List<?> list) {
        list.clear();
        return list;
    }

    // 10 Write a Java program to check if an array list is empty or not.
    public static boolean checkIfListIsEmpty(List<?> list) {
        boolean isEmpty = list.isEmpty();
        return isEmpty;
    }

    // 11 Write a Java program to trim the capacity of an array list the current list size.
    public static ArrayList<?> getTrimmedList(List<?> list) {
        ArrayList<?> trimmedList = new ArrayList<>();
        trimmedList.trimToSize();
        return trimmedList;
    }

    // 12 Write a Java program to increase the size of an array list.
    public static<T> List<T> getIncreasedList(List<T> list, int size) {
        ArrayList<?> increasedList = (ArrayList<?>) list;
        increasedList.ensureCapacity(size);
        return list;
    }

    //  13 Write a Java program to replace the second element of a ArrayList with the specified element.
    public static<T> List<T> replaceElementInList(List<T> list, int index, Object element) {
        list.set(index, (T) element);
        return list;
    }

    // 14 Write a Java program to print all the elements of a ArrayList using the position of the elements.
    public static void printAllElementsByPosition(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}