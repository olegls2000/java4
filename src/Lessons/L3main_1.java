package Lessons;

import java.sql.SQLOutput;

public class L3main_1 {

    public static void printLoop5(int from, int till) {
        while (from <= till) {
            System.out.println("hay");
            from += 5;
        }
    }

    public static void count(int i){
        while(i < 56){
            System.out.println(i);
            i++;
        }

    }


    public static void main(String[] args) {
        int i = 100000;
        while (i >= 1) {
            System.out.println("hay");
            i /= 10;
        }

        printLoop5(5, 10);

        for (int j = 6; j <= 60; j = j + 3) {
            System.out.println("hello world");
        }


        long[] myArray = {1l, 2l, 3l};
        boolean[] mybooArray = {true, false, true};
        String[] myStringArray = {"text1", "text1"};


        char[] myCharArray = new char[5];

        myCharArray[0] = 'A';
        myCharArray[1] = 'B';
        myCharArray[2] = 'C';
        myCharArray[3] = 'D';
        myCharArray[4] = 'E';
        System.out.println(myCharArray[4]);


    }



    public static void printStringArray(String[] array) {
        System.out.print("[");
        for (int h = 0; h < array.length; h++) {
            System.out.print(array[h]);
            if (h == array.length - 1) {
                break;
            }
            System.out.println(" , ");
        }
        System.out.println("]");
    }
}











