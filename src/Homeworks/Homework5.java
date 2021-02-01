package Homeworks;

public class Homework5 {
    public static void checkArrayForFive(int[] array){

        for(int i=0; i< array.length;i++){

            if(array[i] % 5 == 0) {
                System.out.println("The number " + array[i] + " is divisible by 5");
            }
        }
    }

    public static void main(String args[]){

        int[] array1 = new int[]{6,93,44,45,55,789,23};
        checkArrayForFive(array1);

    }

}
