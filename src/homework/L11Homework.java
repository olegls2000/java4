package homework;

public class L11Homework {
    public static void main(String[] args) {

        getFactorial(4);

        sumOfFactorials(15);

    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }

        System.out.println("Factorial of" + f + " = " + result);

        return result;
    }

    public static long sumOfFactorials(long n) {
        long sum = 0;

        int i = 1;

        while (i <= n) {
            int factorial = 1;
            int j = 1;

            while (j <= i) {
                factorial = factorial * j;
                j = j + 1;
            }
            sum = sum + factorial;
            i = i + 1;
        }
        System.out.println("Sum of factorials: " + sum);
        return sum;
    }

}
