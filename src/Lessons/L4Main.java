package Lessons;

import Lessons.L3Main;

public class L4Main {
    public static void main(String[] args) {
        int[] array = L3Main.generateArray(5, -100, 100);
        int max = getMax(array);
        int max1 = getMax(L3Main.generateArray(10, -100, 200));

        int min1 = getMin(L3Main.generateArray(10, -100, 200));
        int min2 = getMin(L3Main.generateArray(5, -200, 200));

        //2  6  1  8 ->  2  6  8  1
        findMinMaxAndReplace(L3Main.generateArray(4, -100, 100));

        String[][] array2D =
                {
                        {"00", "01"}, // i = 0
                        {"10", "11"}  // i = 1
                };
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        int[][] array2DInt = {{5, 9, 0, 777}, {5, 55, 999, 54}, {5, 77, 888, 54}};

        System.out.println(array2DInt[2][2]); //-> 888
        int[][] array2DInt2 = generate2DIntArray(5, 5, -100, 100);
        print2DIntArray(array2DInt2);
    }

    public static void print2DIntArray(int[][] array2D) {
        System.out.print("[");
        for (int i = 0; i < array2D.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]);
                if (j < array2D[i].length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.print("]");
            if (i < array2D.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.print("]");
    }


    public static int[][] generate2DIntArray(int lines, int columns, int from, int till) {
        int[][] result = new int[lines][columns];
        for (int i = 0; i < result.length; i++) {
            result[i] = L3Main.generateArray(columns, from, till);
        }
        return result;
    }


    public static int[] findMinMaxAndReplace(int[] array) {
        System.out.println("Array Before:");
        L3Main.printIntArray(array);
        int iMax = 0;
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Maximum index: " + iMax + ", value: " + array[iMax]);
        System.out.println("Minimum index: " + iMin + ", value: " + array[iMin]);

        int valueMax = array[iMax];
        int valueMin = array[iMin];
        array[iMax] = valueMin;
        array[iMin] = valueMax;

        System.out.println("Array After:");
        L3Main.printIntArray(array);
       /* Lessons.L3Main.printIntArray(array);
        System.out.println("Maximum index is: " + iMax + ", value: " + array[iMax]);*/
        return array;
    }

    public static int getMin(int[] array) {
        return 0;
    }

    public static int getMax(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        L3Main.printIntArray(array);
        System.out.println("Maximum is: " + result);

        return result;
    }
}