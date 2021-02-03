package utils;

import model.Human;
import model.Square;
import model.Worker;

public class MyUtils {

    public static String getRandomItem(String[] items) {
        int randomIndex = getRandomFromRange(0, items.length);
        return items[randomIndex];

    }
    public static int getRandomFromRange(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }
    public static long getRandomFromRange(long from, long till) {
        long result = (long) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
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

    public static void oddOrEven(int i) {
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

    public static void isTrianglePossible(int a, int b, int c) {
        if (a + b < c || b + c < a || a + c < b) {
            System.out.println("Impossible");
        } else {
            System.out.println("Possible");
        }


    }
    public static void checkRange(int number) {
        if (number >= 10 && number <= 20) {
            System.out.println("In interval");
        } else {
            System.out.println("Not in interval");
        }
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
    // Create Method which reformat 2D array of numbers int in that way
    // that first element in a row is always  minimal element from the row

    //  5 5 6     5  9  6
    //  6 5 7 ->  5  6  7
    //  6 3 7     3  6  7

    public static int[][] arrayReformat(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMin = 0;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < array[i][indexMin]) {
                    indexMin = j;
                }
            }
            int temp = array[i][0];
            array[i][0] = array[i][indexMin];
            array[i][indexMin] = temp;
        }
        return array;
    }
    public static void print2DIntArray(int[][] array2D) {
        System.out.print("[");
        for (int i = 0; i < array2D.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]);
                if (j < array2D[i].length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.print("]");
            if (i < array2D.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.print("]");
    }


    public static int[][] generate2DIntArray(int lines, int columns, int from, int till) {
        int[][] result = new int[lines][columns];
        for (int i = 0; i < result.length; i++) {
            result[i] = generateArray(columns, from, till);
        }
        return result;
    }


    public static int[] findMinMaxAndReplace(int[] array) {
        System.out.println("Array Before:");
        printIntArray(array);
        int iMax = 0;
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Maximum index: " + iMax + ", value: " + array[iMax]);
        System.out.println("Minimum index: " + iMin + ", value: " + array[iMin]);

        int valueMax = array[iMax];
        int valueMin = array[iMin];
        array[iMax] = valueMin;
        array[iMin] = valueMax;

        System.out.println("Array After:");
        printIntArray(array);
       /* lessons.L3Main.printIntArray(array);
        System.out.println("Maximum index is: " + iMax + ", value: " + array[iMax]);*/
        return array;
    }

    public static int getMin(int[] array) {
        return 0;
    }

    public static int getMax(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        printIntArray(array);
        System.out.println("Maximum is: " + result);

        return result;
    }
    public static void mutateObject(Human human) {
        //human.lastName = "newLN";
    }

    public static int mutateValue(int value) {
        value--;

        return value;
    }

    public static Integer mutateWrapper(Integer wrapInt) {
        //wrapInt --;
        Integer result = wrapInt - 1;


        //return wrapInt;
        return result;
    }

    public static double calculateAveragePerimetr(Square[] squares) {
        int summ = 0;
        for (Square sq : squares) {
            //summ = summ + square.calculatePerimetr();
            summ += sq.getPerimetr();
        }

        return summ / squares.length;
    }
    public static int maxNumber(int a, int b, int c)
    {
        int max;
        if (a > b && a > c)
        {
            max = a;
        }
        else
        {
            max = Math.max(b, c);
        }
        return max;
    }
    public static int randomNumberFromRange()
    {
        int from = 100;
        int to = 500; // 999
        int random = (int) (Math.random() * (to - from)) + from;
        return random;
    }
    public static double randomDoubleNumberFromRange(double from, double to)
    {
        double random = Math.round((Math.random() * (to - from) + from) * 10) / 10.0;
        return random;
    }
    public static int highestDigitInNumber(int number)
    {
        int a = number / 100;
        int b = number % 10;
        int c = (number / 10) % 10;
        return maxNumber(a, b, c);
    }
    public static void equationSolution(int a, int b, int c)
    {
        int D = (int) Math.pow(b, 2) - (4 * a * c);
        if (D < 0)
        {
            System.out.println("Equation " + a + "x² + " + b + "x + " + c + " = 0 has no solution.");
        }
        else if (D == 0)
        {
            int x1 = (int) (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("Equation " + a + "x² + " + b + "x + " + c + " = 0 has next solution: x1 = " + x1);
        }
        else
        {
            int x1 = (int) (-b + Math.sqrt(D)) / 2 * a;
            int x2 = (int) (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("Equation " + a + "x² + " + b + "x + " + c + " = 0 has next solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }
    public static int getMax2D(int[][] array) {
        int result = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > result) {
                    result = array[i][j];
                }
            }
        }
        print2DIntArray(array);
        System.out.println("Maximum is: " + result);

        return result;
    }

    //* Create Method which find in 2D array Minimum number
    public static int getMin2D(int[][] array) {
        int result = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] < result) {
                    result = array[i][j];
                }
            }
        }
        print2DIntArray(array);
        System.out.println("Maximum is: " + result);

        return result;

    }

    public static int[][] findAndRep(int[][] array) {
        System.out.println("Array Before:");
        MyUtils.print2DIntArray(array);
        int x = 0;
        int y = 0;
        int minX = 0;
        int maxX = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[i][x] ) {
                    x = j;
                }
                if (array[i][j] < array[i][x]) {
                    y = j;
                }
            }
        }
        System.out.println("Maximum index: " + x + ", value: " + x);
        System.out.println("Minimum index: " + y + ", value: " + y);
        int valueMax = x;
        int valueMin = y;
        x = valueMin;
        y = valueMax;
        System.out.println("Array After:");
        print2DIntArray(array);
        return array;
    }

    //* Create a Method which:  checks if number passed in the parameter in interval (5, 500].
    // If number is in interval then print out "In interval", if no: "Out of Interval"
    public static int checkNumberPass(int a) {
        if (a >= 5 && a <= 500) {
            System.out.println("In interval");
        } else {
            System.out.println("Out of Interval");
        }
        return a;
    }

    //* Create a Method which:  checks if number passed in the parameter equal  6, 5, 8, 9 then print out: "False "
// , if no: "True".
    public static int checkNumberParEq(int b) {
        if (b == 6 || b == 5 || b == 8 || b == 9) {
            System.out.println("False");
        } else {
            System.out.println("True");

        }
        return b;
    }

    //Create a Method which:  checks if character passed in the parameter equals: 'A'
// then print out: "Right choise!", if equals 'B'   then print out:  "Your choise B",
// for other cases: "Try another input".
    public static char checkChar(char c) {
        switch (c) {
            case 'A':
                System.out.println("Right choice");
                break;
            case 'B':
                System.out.println("Your choice B");
                break;
            default:
                System.out.println("Try another input");
                break;
        }
        return c;
    }


    //Create a Method which:   take in the parameter array of numbers and print of only positive elements.
////4
    public static int CountPositive(int[] a) {
        int i, positiveCount = 0;
        System.out.print("Positive:");
        for (i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                System.out.print(a[i] + " ");
                positiveCount++;
            }
        }
        return positiveCount;
    }
    public static double calculateAverageSalary(Worker[] workers) {
        int summ = 0;
        for (Worker wk : workers) {
            summ += wk.calculateSalary();
        }
        return summ / workers.length;
    }

    public static double calculateAverageAge(Worker[] workers) {
        int summ = 0;
        for (Worker wk : workers) {
            summ += wk.calculateAge();
        }
        return summ / workers.length;
    }
    public static final int DAYS_IN_WEEK = 7;



    public static int getRandomFromRangeX(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }
}