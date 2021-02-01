package Homework;

public class L3Homework {
    public static void main(String[] args) {
        // 1 assignment
        int randomNumber = L2Homework.getRandomNumberFromRange(0, 1000);
        checkNumberInOutOfRange(randomNumber);
        // 2 assignment
        System.out.println(checkIfEqual(15));
        // 3 assignment
        checkCharacter('S');
        // 4 assignment
        getMultipliedByTwoNumbersArray(10);
        // 5 assignment
        System.out.print("Positive numbers are ");
        getPositiveNumbersFromArray(getRandomArray(-15, 15, 10));
        // 6 assignment
        System.out.println();
        getNumbersMultipliedByFive(getRandomArray(1, 99, 30));
        // 7 assignment
        System.out.println();
        getNumberMultipliedBy(getRandomArray(27, 54, 30), 3);
    }

    public static void checkNumberInOutOfRange(int number)
    {
        int from = 5;
        int to = 500;
        if (number >= from && number <= to)
        {
            System.out.println("Number " + number + " is in range.");
        }
        else
        {
            System.out.println("Number " + number + " is out of range.");
        }
    }

    public static boolean checkIfEqual(int number)
    {
        boolean result = true;
        int[] numbers = {6, 5, 8, 9};
        for (int num : numbers)
        {
            if (number == num)
            {
                result = false;
            }
        }
        return result;
    }

    public static void checkCharacter(char letter)
    {
        switch (letter)
        {
            case 'A':
                System.out.println("Right choice!");
                break;
            case 'B':
                System.out.println("Your choice is B");
                break;
            default:
                System.out.println("Try another input!");
        }
    }

    public static void getMultipliedByTwoNumbersArray(int size)
    {
        int x = 1;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++)
        {
            x *= 2;
            numbers[i] = x;
            if (i == numbers.length - 1)
            {
                System.out.println(x + "");
            }
            else
            {
                System.out.print(x + " ");
            }
        }
    }

    public static void getPositiveNumbersFromArray(int[] array)
    {
        for (int number : array)
        {
            if (number > 0)
            {
                System.out.print(number + " ");
            }
        }
    }

    public static int[] getRandomArray(int from, int to, int size)
    {
        int[] array = new int[size];
        for (int i = 0; i < array.length - 1; i++)
        {
            array[i] = L2Homework.getRandomNumberFromRange(from, to);
        }
        return array;
    }

    public static void getNumbersMultipliedByFive(int[] array)
    {
        int i = 0;
        while (i < array.length - 1)
        {
            if (array[i] % 5 == 0)
            {
                System.out.print(array[i] + " ");
            }
            i++;
        }
    }
    public static void getNumberMultipliedBy(int[] array, int multiplier)
    {
        int i = 0;
        while (i < array.length - 1)
        {
            if (array[i] % multiplier == 0)
            {
                System.out.print(array[i] + " ");
            }
            i++;
        }
    }
}