package homework;

import lessons.L2Main;
import utils.MyUtils;

public class L3Homework {
    public static void main(String[] args) {

        //* Create a Method which:  checks if number passed in the parameter in interval (5, 500]. If number is in interval then print out
        // "In interval", if no: "Out of Interval"

        checkRange(MyUtils.getRandomFromRange(-500, 500));

        //* Create a Method which:  checks if number passed in the parameter equal  6, 5, 8, 9 then print out: "False " , if no: "True".

        checkEqual(MyUtils.getRandomFromRange(0,10));

        //* Create a Method which:  checks if character passed in the parameter equals: 'A'   then print out: "Right choise!", if equals 'B'
        // then print out:  "Your choise B", for other cases: "Try another input".



        //* Create a Method which:  creates and returns array (size = 10) with next elements:  2 4 8 16 32 64 128 ….. Print out array content.

        int[] array2x = generateArray(10);
        printIntArray(array2x);

        //* Create a Method which:   take in the parameter array of numbers and print of only positive elements.


        //* Create a Method which:   take in the parameter array of numbers and print of only elements that multiplied by 5; use while loop.


        //* Create a Method which:   take in the parameter array of numbers and print of only elements that multiplied by n; use while loop.
        // n - aone more parameret in Method

    }

    public static void answer(char abc){

        }





    public static int[] generateArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = (int) Math.pow(2, i+1);
        }
        return newArray;
    }

    public static void printIntArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i == array.length - 1){
                break;
            }
            System.out.print(" , ");
        }
        System.out.println("]");
    }

    public static void checkEqual(int number){
        if (number == 5 || number == 6 || number == 8 || number == 9){
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void checkRange(int number){
        if (number >= 5 && number <= 500){
            System.out.println("In interval");
        } else {
            System.out.println("Out of Interval");
        }
    }

}
