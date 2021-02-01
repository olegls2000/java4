package Homeworks;

public class Homework_2 {



    public static void checkInRange(int x, int[] array){

        for(int i = 0; i < array.length; i++) {

            if(x == array[i]) {
                System.out.println("True");
                break;
            } else if (i ==  array.length -1) {
                System.out.println("False");
            }
        }
    }

    public static void main(String[] args){

        int[] numberList = new int[]{5,6,8,9};


        checkInRange(5, numberList);
    }
}





