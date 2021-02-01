package utils;

public class MyUtils {

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
}
