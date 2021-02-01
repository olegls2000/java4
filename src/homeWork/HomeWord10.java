package homeWork;

import java.math.BigInteger;

public class HomeWord10 {
    public static void main(String[] args) {
        System.out.println("Fack = " + getFackFackFack(4));
        factor();


    }

    private static long getFackFackFack(int n) {

        if (n == 1) {

            return 1l;

        }

        return n * (getFackFackFack(n - 1));

    }

    public static void factor() {


        int n = 0;
        BigInteger factorial = BigInteger.ONE;
        while (n <= 15) {
            System.out.printf("Factorial(%d) = %s%n", n, factorial);
            n++;
            factorial = factorial.multiply(BigInteger.valueOf(n));
        }
    }
}


