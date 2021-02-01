package Lessons;

import Utils.MyUtils;

public class L3Main {
    public static void main(String[] args) {
        int random = MyUtils.getRandomFromRange(1, 20);
        System.out.println("Random: " + random);
        //[1..5] - > 1+; [6..10] -> 6+; [11 ..20] 11+;
        if (random >= 1 && random <= 5) {
            System.out.println("1+");
        } else if (random >= 6 && random <= 10) {
            System.out.println("6+");
        } else if (random >= 11 && random <= 20) {
            System.out.println("11+");
        }

        int newRandom = MyUtils.getRandomFromRange(1, 3);
        System.out.println("New Random: " + newRandom);
        switch (newRandom) {
            default:
                System.out.println("Number is not in cases!");
                break;
            case 1:
                System.out.println("One was generated!");
                break;
            case 2:
                System.out.println("Two was generated!");
                break;
            case 3:
                System.out.println("Three was generated!");
                break;
        }

        int i1 = 0;
        while (i1 < 2) {
            System.out.println("Hello from While!!!");
            i1++;
        }

        //-10, -9, ... +10
        //...
        printLoopIncrement(-10, 10);
       /* int k = -10;
        while (k <= 10) {
            System.out.println(k);
            k++;
        }*/
        //100, 102, ... 150
        int k = 100;
        while (k <= 150) {
            System.out.println(k);
            k += 2;
        }

        //100_000, 10_000, ... 1
        k = 100_000;
        while (k > 1) {
            System.out.println(k);
            k /= 10; //k = k / 10;
        }

        printLoop5(0, 20);

        int dow = 5;
        do {
            System.out.println("I started Do While");
            System.out.println(dow);
            dow--;
        } while (dow > 3);

        System.out.println(dow);

        //fori
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello from fori: i = " + i);
        }
        //6, 9, 12, ... 60
        long[] myArray = {1l, 2l, 3l};
        boolean[] myBoolArray = {true, false, true};
        String[] myStringArray = {"text1", "text2"};

        //has length:
        System.out.println(myArray.length);
        System.out.println(myStringArray.length);

        //provides index access:
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[0]);

        //arrays are immutable (not able to resize):
        String[] myStringArray1 = new String[5];
        System.out.println(myStringArray1.length);
        myStringArray1[0] = "0";
        myStringArray1[1] = "1";
        myStringArray1[4] = "4";
        printStringArray(myStringArray1);
        int[] intArr = {5, 6, 7, 8, 9};
        printIntArrayReverse(intArr);

        //Создайте метод, выводящий на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …. Цикл FOR
        printSequence(55);
        //Создайте метод, выводящий на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …. WHILE
        int[] intArray = generateArray(10, 0, 10);
        printIntArrayReverse(intArray);
    }

    public static int[] generateArray(int size, int randomFrom, int randomTill) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = MyUtils.getRandomFromRange(randomFrom, randomTill);
        }

        return newArray;
    }

    public static void printSequence(int times) {
        int ceed = 1;
        for (int i = 0; i < times; i++) {
            System.out.print(ceed + ", ");
            ceed += 2;
        }
        System.out.println();
    }


    public static void printIntArrayReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i == 0) {
                break;
            }
            System.out.print(" , ");
        }
        System.out.println("]");
    }


    public static void printIntArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                break;
            }
            System.out.print(" , ");
        }
        System.out.println("]");
    }

    public static void printStringArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                break;
            }
            System.out.print(" , ");
        }
        System.out.println("]");
    }


    //[2000, 1500] -> 2000, 1990, 1980, ... 1500
    //[0, 20] -> 0, 5, 10, ... 20
    public static void printLoop5(int from, int till) {
        while (from <= till) {
            System.out.println(from);
            from += 5;
        }
    }

    public static void printLoopIncrement(int from, int till) {
        while (from <= till) {
            System.out.println(from);
            from++;
        }
    }


}