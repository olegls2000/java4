package homework;

public class L1Homework {
    public static void main(String[] args) {
        // 1 assignment
        int number = 67;
        int digit1 = number / 10;
        int digit2 = number % 10;
        int sum = digit1 + digit2;
        System.out.println(number + " -> " + digit1 + " + " + digit2 + " = " + sum);
        // 2 assignment
        int number2 = 69;
        double equationSum = ((number2 / 100) + (18 * ((number2 - Math.pow(13, 2) + (number2 / 3.14)))));
        System.out.println("The sum of the equation is equal to " + equationSum);
        // 3 assignment
        int a = 16;
        int b = 5;
        int division = a / b;
        int remainder = a % b;
        System.out.println(a + " / " + b + " = " + division + ", remaining " + remainder);
        // 4 assignment
        int m = 5;
        int n = 90;
        int max;
        boolean closer = m > n;
        if (closer)
        {
            max = m;
        }
        else
        {
            max = n;
        }
        System.out.println("m = " + m + ", n = " + n + "; " + max + " is closer to 100.");
        // 5 assignment
        int number4 = 27;
        if (number4 % 2 == 0)
        {
            System.out.println("Number " + number4 + " is even.");
        }
        else
        {
            System.out.println("Number " + number4 + " is odd.");
        }
    }
}