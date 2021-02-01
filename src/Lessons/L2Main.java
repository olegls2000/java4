package Lessons;

import Utils.MyUtils;

public class L2Main {
    public static void main(String... args) {
        double myFirstRandom = Math.random(); // [0, 1)
        System.out.println(myFirstRandom);
        // [0, 10)
        int zeroTen = MyUtils.getRandomFromRange(0, 10);
        // [2, 10)
        int twoTen = MyUtils.getRandomFromRange(2, 10);
        // [10, 80)
        int gg = MyUtils.getRandomFromRange(10, 80);
        int random = MyUtils.getRandomFromRange(498, 500);
        random = MyUtils.getRandomFromRange(800, 1600);

        printHelloWorld("!", "!");   //!  !
        printHelloWorld("!", "?");   //!  ?
        printHelloWorld(".", "?");   //.  ?
        printHelloWorld("?", ";");   //?  ;

        int numberFromMethod = getNumber();
        System.out.println("numberFromMethod = " + getNumber());

        isFive(6);
        isFive(5);

        oddOrEven(9);
        oddOrEven(10);

        int num1 = MyUtils.getRandomFromRange(1, 10);
        int num2 = MyUtils.getRandomFromRange(1, 10);

        int closest = getClosestTo100(MyUtils.getRandomFromRange(1, 10),
                MyUtils.getRandomFromRange(1, 10));
        closest = getClosestTo100(num1, num2);

        int sideA = 10;
        int sideB = 10;
        int sideC = 100;

        isTrianglePossible(sideA, sideB, sideC); //-> "Possible" or "Impossible"

        boolean bool1 = false;
        boolean bool2 = false;
        boolean bool3 = true;

        boolean result = bool1 && bool2 && bool3;
        System.out.println(" Result of & = " + result);

        boolean resultOr = bool1 || bool2 || bool3;
        System.out.println(" Result of | = " + resultOr);

        checkRange(MyUtils.getRandomFromRange(5, 25));
    }

    //interval: [10, 20], random number [5, 25]; Check if number " In interval" ; "Not in interval";
    public static void checkRange(int number) {
        if (number >= 10 && number <= 20) {
            System.out.println("In interval");
        } else {
            System.out.println("Not in interval");
        }
    }


    public static void isTrianglePossible(int a, int b, int c) {
        if (a + b < c || b + c < a || a + c < b) {
            System.out.println("Impossible");
        } else {
            System.out.println("Possible");
        }
    }

    public static int getClosestTo100(int a, int b) {
        int deltaA = Math.abs(100 - a);
        int deltaB = Math.abs(100 - b);
        int result;
        if (deltaA < deltaB) {
            result = a;
        } else {
            result = b;
        }
        System.out.println(" closest to 100 is: " + result);
        return result;
    }

    public static int getClosestTo100Tern(int a, int b) {
        int deltaA = Math.abs(100 - a);
        int deltaB = Math.abs(100 - b);
        int result = deltaA < deltaB ? a : b;
        System.out.println(" closest to 100 is: " + result);
        return result;
    }


    private static void oddOrEven(int i) {
        if (i % 2 == 0) {
            System.out.println("Number is ODD");
        } else {
            System.out.println("Number is EVEN");
        }
    }

    public static void isFive(int number) {
        if (number == 5) {
            System.out.println("Number is 5");
        } else {
            System.out.println("Number is not 5");
        }
    }



    public static void printHelloWorld(String end1, String end2) {
        System.out.println("Hello World" + end1);
        System.out.println("Chao" + end2);
    }

    public static int getNumber() {
        //int number = 5;
        return 5;
    }


}