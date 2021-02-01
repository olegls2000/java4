package Lessons;

public class Lmain4 {
    public static void findMinMax(int[] array) {
        int iMax = array[0];
        int iMin = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > iMax) {
                iMax = array[i];
            }
            if (array[i] < iMin) {
                iMin = array[i];
            }

        }
        System.out.println("max: " + iMax);
        System.out.println("min: " + iMin);
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 8, 19, 20, 45};
        findMinMax(array);
    }


}
