package homeWork;

import utils.MyUtils;

import java.util.*;

public class Hw3 {
    //nado sprosit'
    public static void main(String[] args) {

        MyUtils.checkNumberPass(501);
        MyUtils.checkNumberParEq(4);
        MyUtils.checkChar('B');
        int[] b = {2, 3, 4, 5, 6, 7, 8, 9, -1, 0};//0?
        MyUtils.CountPositive(b);


//     Create a Method which:  creates and returns array (size = 10) with next elements:  2 4 8 16 32 64 128 …..
// Print out array content


        Random rand = new Random(47);

        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.println((char) c + " , " + c + " : ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("rnacHaa");
                    break;
                case 'y':
                case 'w':
                    System.out.println("ycnoBHO гласная");
                    break;
                default:
                    System.out.println("cornacHaa");
            }
        }
    }

//take in the parameter array of numbers and print of only elements that multiplied by 5; use while loop.

    }

    

