package lessons;

public class L11Main {
    public static void main(String[] args) {
        /*cyclePrint(6);
        recPrint(9);
        System.out.println();
        recPrintReverse(7);*/

        doSomethingWithException();

        try {
            doSomethingWithException();
        } catch (IllegalArgumentException exception)
        {
            exception.printStackTrace();
            System.out.println("Exception caught and handled.");
        }
    }

    private static void doSomethingWithException()
    {
        int[] array = {1, 2};
        System.out.println(array[3]);
        /*//IllegalArgumentException newException = new IllegalArgumentException("E pa pa Exception!");
        int[] array = {1, 2};
        if (array.length < 3)
        {
            throw newException;
        }*/
    }

    static long getFibonacciNumber(int place)
    {
        if (place == 0)
        {
            return 0l;
        }
        if (place == 1)
        {
            return 1l;
        }
        return getFibonacciNumber(place - 1) + getFibonacciNumber(place - 2);
    }

    private static void recPrint(int n)
    {
        System.out.print(n + " ");
        if (n <= 1)
        {
            return;
        }
        // Prefix --n/ Postfix n--
        recPrint(--n); //n-- = n - 1
    }

    private static void recPrintReverse(int n)
    {
        if (n == 1)
        {
            return;
        }
        recPrintReverse(--n);
        System.out.print(n + " ");
    }

    private static void cyclePrint(int n)
    {
        do {
            System.out.print(n + " ");
            n--;
        }
        while(1 <= n);
        System.out.println();
    }
}
