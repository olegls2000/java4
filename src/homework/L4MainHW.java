package homework;

import lessons.L4Main;

public class L4MainHW {

    public static void main(String[] args) {
        int [][] array = L4Main.generate2DIntArray(3,3, 0, 100);
        L4Main.print2DIntArray(array);
        System.out.println("-----------------------------------");

        array = arrayReformat(array);
        L4Main.print2DIntArray(array);
    }

    // Create Method which reformat 2D array of numbers int in that way
    // that first element in a row is always  minimal element from the row

    //  5 5 6     5  9  6
    //  6 5 7 ->  5  6  7
    //  6 3 7     3  6  7

    static int[][] arrayReformat(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMin = 0;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < array[i][indexMin]) {
                    indexMin = j;
                }
            }
            int temp = array[i][0];
            array[i][0] = array[i][indexMin];
            array[i][indexMin] = temp;
        }
        return array;
    }
}
