package homework;

import java.util.*;

import static utils.ListMethods.*;

public class L16Homework {
    public static void main(String[] args)
            throws Exception {
        List<Object> arrayListAnimals = new ArrayList<>(); // first list
        Object[] animals = new Object[] {"Cats", "Dogs", "Birds", "Fish", "Insects"};
        arrayListAnimals.addAll(Arrays.asList(animals));

        List<Number> arrayListNumbers = new ArrayList<>(); // second list
        Number[] numbers = new Number[] {1, 2, 3, 4, 5};
        arrayListAnimals.addAll(Arrays.asList(animals));

        List<Object> arrayListPeople = new ArrayList<>(); // third list
        Object[] people = new Object[] {"John", "Mary", "Anna", "Fred", "Bob"}; // "John", "Mary", "Anna", "Fred", "Bob"
        arrayListPeople.addAll(Arrays.asList(people));

        /*// 1
        System.out.println(arrayListAnimals);
        getElementFromList(arrayListAnimals, "Bes");
        // 2 IMPROVE
        getListCopy(arrayListAnimals, arrayListPeople);
        // 3
        System.out.println(arrayListPeople);
        System.out.println(getShuffledList(arrayListPeople));
        // 4
        System.out.println(getReverseList(arrayListPeople));
        // 5
        System.out.println(arrayListPeople);
        System.out.println(extractPortionOfList(arrayListPeople, -1, 1));
        // 6
        System.out.println(compareTwoLists(arrayListAnimals, arrayListPeople));
        // 7
        System.out.println(arrayListPeople);
        System.out.println(swapTwoElementsInArrayList
                (arrayListPeople, 3, 7));*/
        /*// 8
        System.out.println(concatenateTwoLists
                (arrayListAnimals, arrayListPeople));
        // 9
        System.out.println(getClearedList(arrayListAnimals));
        // 10
        System.out.println(checkIfListIsEmpty(arrayListPeople));
        // 11
        // NEED TO CHECK*/

        /*// 12 NEED CHECK
        System.out.println(getIncreasedList(arrayListAnimals, 15));
        System.out.println(arrayListAnimals.size());*/

        /*// 13
        System.out.println(replaceElementInList
                (arrayListAnimals, 1, "Doggies"));
        // 14
        printAllElementsByPosition(arrayListAnimals);*/

        /*// 2 IMPROVE (different types of lists)?
        getListCopy(arrayListAnimals, arrayListNumbers);*/
    }
}