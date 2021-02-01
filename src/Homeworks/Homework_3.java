package Homeworks;

public class Homework_3 {



    public static void checkInRange(char x, String array){

        for(int i = 0; i < array.length(); i++) {

            if(x == array.charAt(i)) {

                System.out.println("True");
                break;
            } else if (i ==  array.length() -1) {
                System.out.println("False");
            }
        }
    }

    public static void main(String[] args){

        String Katerina = "Katerina";

        checkInRange('a', Katerina);
    }
}