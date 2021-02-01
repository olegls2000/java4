package Homeworks;

import java.util.Arrays;

public class Homework_4 {

    public static void main(String args[]){
        int[] numberList = new int[10];
        int number = 2;
        int index = 0;
        while(index < numberList.length) {
            numberList[index] = number;
            number = number * 2;
            index++;
        }
        System.out.println(Arrays.toString(numberList));
    }
}
