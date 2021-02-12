package Lessons;
import java.util.List;
import java.util.ArrayList;
public  class MyUtils {
    public static final int DAYS_IN_WEEK = 7;

    public static int getRandomFromRange(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        System.out.println("Random for the interval: [" + from + ", " + till + ") -> " + result);

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


    public static List<Integer> generateList(int size, int from, int till) {
        List<Integer> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            result.add(getRandomFromRange(from, till));
        }
        return result;
    }

}