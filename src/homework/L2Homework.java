package homework;

import lessons.L2Main;
import utils.MyUtils;


public class L2Homework {
    public static void main(String[] args) {

        //* Create a Method which finds Max from int  numbers a, b and c passed througth parameters.
        // Substitute different numbers. Use Random number generator.

        maxNumb(MyUtils.getRandomFromRange(0,100),MyUtils.getRandomFromRange(0,100),MyUtils.getRandomFromRange(0,100));

        //* Create a Method which generate random number (double) from next interval: [-0.5, +0.9].
        // Generated number should have only one digit after point. (Hint: use Math round)

        getRandom(-0.5, 0.9);

        //* Create a Method which gets int number as a parameter (number from interval: 100 …999) and calculates and returns max digit.
        // Example: "in number 208 the biggest digit is: 8"

        getMaxDigit(MyUtils.getRandomFromRange(100, 999));


        //*Create a Method which calculates and prints out possible solutions of Quadratric Equiation (ax²+bx+c=0). Method gets as parameters a, b and c.
        // Output example: "Exuiation 8x2 + 6x  + 6 = 0 has next solutions: x1=5; x2=10" or "Exuiation 8x2 + 6x  + 6 = 0 has no solution"

        quadraticEquation(1,3,-4);


    }

    public static void quadraticEquation(double a, double b, double c){
        if ((b * b) - 4 * a * c < 0){
            System.out.println("Equation " + a + "x^2 + " + b + "x " + c + " = 0 has no solution");
        } else {
            double x1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
            System.out.println("Equation " + a + "x^2 + " + b + "x " + c + " = 0 has next solutions: x1=" + x1 + "; x2=" +x2);
        }

    }

    public static int getMaxDigit(int r) {
        int result = 0;
        System.out.print("In number " + r);

        if (r > 0) {
            int minDigit = Integer.MAX_VALUE;
            int maxDigit = Integer.MIN_VALUE;

            while (r > 0) {
                int digit = r % 10;

                maxDigit = Math.max(maxDigit, digit);
                minDigit = Math.min(minDigit, digit);

                r /= 10;
            }

            result = maxDigit;
        }
        System.out.println(" the biggest digit is: " + result);

        return result;
    }

    public static void maxNumb(int a,int b, int c){
        if (a > b && a > c) {
            System.out.println("Maximum number is : " + a);
        } else if (b > a && b > c) {
            System.out.println("Maximum number is : " + b);
        } else {
            System.out.println("Maximum number is : " + c);
        }

    }

    public static double getRandom(double from, double till) {
        double result = (Math.random() * (till - from)) + from;
        double roundOff = Math.round(result * 10.0) / 10.0;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + roundOff);

        return roundOff;
    }

}
