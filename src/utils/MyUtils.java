package utils;

import java.util.ArrayList;
import java.util.List;

import static homework.L2Homework.getRandomNumberFromRange;

public class MyUtils {

    public static final int DAYS_IN_WEEK = 7;

    public static List<Integer> generateIntegerList(int size, int from, int till) {
        List<Integer> result = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            result.add(getRandomFromRange(from, till));
        }
        return result;
    }

    public static int getRandomFromRange(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        //System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }

    public static <N extends Number> double getRandomFromRangeG(int from, int till) {
        double result = (int) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }

    public static int getRandomFromRangeY(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }

    public static String getRandomString(String[] array)
    {
        int randomIndex = getRandomNumberFromRange(0, array.length);
        return array[randomIndex];
    }
}