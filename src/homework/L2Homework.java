package homework;

public class L2Homework {
    public static void main(String[] args) {
        // 1 assignment
        int a = getRandomNumberFromRange(100, 500);
        int b = getRandomNumberFromRange(100, 500);
        int c = getRandomNumberFromRange(100, 500);
        System.out.println("Max value from: " + a + ", " + b + ", " + + c + " is " + getMaxNumber(a, b, c));
        // 2 assignment
        System.out.println("Random number from range -0.5 to 0.9 is " + getRandomDoubleNumberFromRange(-0.5, 0.9));
        // 3 assignment
        int number = getRandomNumberFromRange(100, 999);
        System.out.println("Highest digit in " + number + " is " + getHighestDigitInNumber(number));
        // 4 assignment
        equationSolution(1, -2, -3);
    }

    public static int getMaxNumber(int a, int b, int c)
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

    public static int getRandomNumberFromRange(int from, int to)
    {
        int random = (int) (Math.random() * (to - from)) + from;
        return random;
    }

    public static double getRandomDoubleNumberFromRange(double from, double to)
    {
        double random = Math.round((Math.random() * (to - from) + from) * 10) / 10.0;
        return random;
    }

    public static long getRandomLongNumberFromRange(int from, int to)
    {
        long random = Math.round((Math.random() * (to - from) + from) * 10) / 10;
        return random;
    }

    public static int getHighestDigitInNumber(int number)
    {
        int a = number / 100;
        int b = number % 10;
        int c = (number / 10) % 10;
        return getMaxNumber(a, b, c);
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
}