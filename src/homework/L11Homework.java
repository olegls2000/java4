package homework;

public class L11Homework {
    public static void main(String[] args) {
        int number = 4;
        System.out.println("Factorial value of " + number + " is: " + getFactorialValue(number));
        System.out.println("Sum of factorials from 1 to " + number + " is: " + getSumOfFactorials(number));
    }

    static int getFactorialValue(int number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("Negative number!");
        }
        if (number == 0 || number == 1)
        {
            return 1;
        }
        else
        {
            return (number * getFactorialValue(number - 1));
        }
    }

    static Long getSumOfFactorials(int number)
    {
        int limit = 15;
        if (number <= limit)
        {
            if (number == 0)
            {
                return 0l; // if 1l, includes in sum 0! = 1
            }
            else
            {
                return getFactorialValue(number) + getSumOfFactorials(number - 1);
            }
        }
        else
        {
            throw new IllegalArgumentException("Number invalid!");
        }
    }
}