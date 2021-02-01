package homework;

public class L1Homework {
    public static void main(String[] args) {

        // * We have variable n. It consists of two digits Example: 62. Create a program that calculate a summ of two digits.
        // * Output example: 62 -> 6 + 2 = 8

        int n = 62;
        int sumOfDigints = 0;
        while (n > 0) {
            sumOfDigints = sumOfDigints + n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits = " + sumOfDigints);

        // * Create a programm that calculate and print out next state:   69/100+18*(69-13^2+69/3.14).
        //* Also extract 69 to the separate variable with a proper type

        int var = 69;
        double result = var / 100 + 18 * (var - Math.pow(13, 2) + var / 3.14);
        System.out.println(var + " / 100 + 18 * (" + var + " - 13^2 + " + var + " / 3.14) = " + result);

        //* In variables a, b store two digit . Create a program that print out result of division and devision with remaining a to b.
        //* Output example:  "17 / 8  = 2,  remaining 1

        int var1 = 17;
        int var2 = 8;
        int a = var1 / var2;
        int b = var1 % var2;
        System.out.println(var1 + " / " + var2 + " = " + a + ", remaining " + b);

        //* Create a program that define and print out one from two numbers n and m which  is closer to 100.
        //* Output example: "m=5, o=90; 90 is closer to 100

        int m = 5;
        int o = 90;
        int deltaA = Math.abs(100 - m);
        int deltaB = Math.abs(100 - o);
        int result1;
        if (deltaA < deltaB) {
            result1 = m;
        } else {
            result1 = o;
        }
        System.out.println("Closest to 100 is: " + result1);

        //* Create a program that define and print out information if number odd or even.
        //* Output example: "10 is even" or "11 is odd".

        int z = 13;
        if (z % 2 == 0) {
            System.out.println("Number is ODD");
        } else {
            System.out.println("Number is EVEN");
        }
    }
}
