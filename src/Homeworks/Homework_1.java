package Homeworks;

public class Homework_1 {



        public static void checkInRange(int x, int[] array){

            for(int i = 0; i < array.length; i++) {

                if(x == array[i]) {
                    System.out.println("In range");
                    break;
                } else if (i ==  array.length -1) {
                    System.out.println("Out of range");
                }
            }
        }

        public static void main(String[] args){

            int[] range = new int[495];
            int index = 0;
            int number = 5;

            while(index < range.length) {
                range[index] = number;
                number++;
                index++;
            }
            checkInRange(50, range);
        }
    }





