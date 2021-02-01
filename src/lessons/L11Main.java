package lessons;

import java.io.IOException;

public class L11Main {

    //Recursion, Exceptions
    public static void main(String[] args) {
        //recursionTest();

        //Дано натуральное число n. Выведите все числа от n do  1.
        System.out.println("Loop: ");
        cyclePrint(6);
        System.out.println("Recursion: ");
        recursionPrint(6);
        System.out.println();
        int number = 1;

        //Prefix increment/decrement:  --n
        //Postfix increment/decrement: n--
        System.out.println(number++); // 1
        System.out.println(++number); // 3
        System.out.println(number);   // 3
        System.out.println(--number);   // 2

        recursionPrintReverse(6);
        System.out.println();

        int fn = 2;
        System.out.println("Fibo Number [" + fn + "] calculating...");
        System.out.println("Fibo Number [" + fn + "] = " + getFiboByNumber(fn));
        try {
            doSmthWithException(new int[4]);
            doSmthWithException(new int[0]);
        } catch (IOException ioExceptoin) {
            System.out.println("IOException caught and handled");
            ioExceptoin.printStackTrace();
        } catch (IllegalArgumentException exception) {
            System.out.println("Exception caught and handled");
            exception.printStackTrace();
            throw exception;
        }
        System.out.println("Life after Exception is nice!!!");
    }


    private static void doSmthWithException(int[] array) throws IOException {
        if (array.length < 5) {
            IllegalArgumentException newException = new IllegalArgumentException("My First Exception");
            throw newException;
        }

        if (array.length == 0) {
            throw new IOException("My First Checked Exception!");
        }
    }


    //0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    //0, 1, 2, 3, 4, 5, 6, 7,  8,  ...
    private static long getFiboByNumber(int n) {
        if (n == 0) {
            return 0l;
        }
        if (n == 1) {
            return 1l;
        }
        return getFiboByNumber(n - 1) + getFiboByNumber(n - 2);
    }


    //  1.. n
    private static void recursionPrintReverse(int n) {
        //int n1 = 1;
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        int nr = n - 1;
        recursionPrintReverse(nr);
        System.out.print(n + " ");
    }

    // n, n-1, ... 1
    private static void recursionPrint(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        recursionPrint(--n);
    }

    //3 2 1
    private static void cyclePrint(int n) {
        do {
            System.out.print(n + " ");
            --n;
        } while (1 <= n);
        System.out.println();
    }


    private static void recursionTest() {
        System.out.println("Hello From recursionTest();");
        recursionTest();
    }
}
