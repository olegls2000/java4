package Homeworks;

public class Homework7 {
    public static void matrixMax(int[][] array) {
        int iMax = array[0][0];

        for (int i = 0; i < array.length; i++) {
           // iMax = i;

            for (int j = 0; j < array[i].length; j++) {
                if (iMax < array[i][j]) {
                    iMax = array[i][j];
                }
            }
        }
       System.out.println(iMax);
    }

    public static void matrixMin(int[][] array1) {
        int iMin = array1[0][0];

        for (int i = 0; i < array1.length; i++) {
           // iMin = i;

            for (int j = 0; j < array1[i].length; j++) {
                if (iMin > array1[i][j]) {
                    iMin = array1[i][j];
                }
            }
        }
        System.out.println(iMin);
    }



    public static void main(String[] args) {
        int[][] array = {{1,5,10,98,4,3}, {0,888,3,67,98,1,293,891}};
        matrixMax(array);
        int[][] array1 = {{1,5,10,98,4,3}, {0,888,3,67,98,1,293,891}};
        matrixMin(array1);
    }
}