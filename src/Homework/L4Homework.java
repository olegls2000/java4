package Homework;

public class L4Homework {
    public static void main(String[] args) {
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("2D Array:");
        printInt2DArray(array2D);
        System.out.println("\nMin value from 2D array is: " + getMinValueIn2DArray(array2D));
        System.out.println("Max value from 2D array is: " + getMaxValueIn2DArray(array2D));
        // 3 assignment
        System.out.println("\n2D Array after swap of min with max:");
        printInt2DArray(swapMinMaxIn2DArray(array2D));
        // 4 assignment
        System.out.println("\n2D Array after swap of first element to min:");
        //printInt2DArray(swapFirstElementOfRowToMin(array2D));
    }
    public static int getMaxValueIn2DArray(int[][] array)
    {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > maxValue)
                {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    public static int getMinValueIn2DArray(int[][] array)
    {
        int minValue = array[0][0];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] < minValue)
                {
                    minValue = array[i][j];
                }
            }
        }
        return minValue;
    }

    public static int[][] swapMinMaxIn2DArray(int[][] array)
    {
        int max = getMaxValueIn2DArray(array);
        int min = getMinValueIn2DArray(array);
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] == max)
                {
                    array[i][j] = min;
                }
                else if (array[i][j] == min)
                {
                    array[i][j] = max;
                }
            }
        }
        return array;
    }

    /*public static int[][] swapFirstElementOfRowToMin(int[][] array)
    {
        int iMin = 0;
        int jMin = 0;
        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array[j].length; i++)
            {
                if (minValueRow > array[j][i])
                {
                    minValueRow = array[j][i];
                    iMin = i;
                    jMin = j;
                }
            }
            if (array[j].length == 1)
            {
                minValueRow = array[j][0];
            }
            else
            {
                int temp = array[j][0];
                array[j][0] = minValueRow;
                array[jMin][iMin] = temp;
            }
        }
        return array;
    }*/

    public static void printInt2DArray(int array[][])
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    /*public static int[][] get2DIntArray(int row, int col, int from, int to)
    {
        int[][] result = new int[row][col];
        for (int i = 0; i < result.length; i++) // i < row
        {
            result[i] = L3Homework.getRandomArray(col, from, to);
        }
        return result;
    }*/

    static int[][] swapFirstElementOfRowToMin(int[][] array) {
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