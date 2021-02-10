package utils;

import model.AbstractWorker;
import model.Shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyUtils {

    public static final int DAYS_IN_WEEK = 7;

    public static Integer getRandomFromRange(int from, int till) {
        Integer result = (int) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }

    public static Long getRandomFromRangeL(int from, int till) {
        Long result = (long) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }

    public static <N extends AbstractWorker, M extends Shape> double getRandomFromRangeG(int from, int till) {

        double result = (Math.random() * (till - from)) + from;

        N worker = null;
        worker.getAge();

        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);
        return result;
    }

    public static List<Integer> generateList(int size, int from, int till) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            result.add(getRandomFromRange(from, till));
        }
        return result;
    }

    public static int getRandomFromRangeX(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

        return result;
    }

    public static String getRandomItem(String[] items) {
        int randomIndex = getRandomFromRange(0, items.length);
        return items[randomIndex];
    }
}
