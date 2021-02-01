package homeWork;

import utils.MyUtils;

public class L4HomeWorkMain {

    public static void main(String[] args) {
        int [][] array = MyUtils.generate2DIntArray(3,3, 0, 100);
        MyUtils.print2DIntArray(array);
        System.out.println("-----------------------------------");

        array = MyUtils.arrayReformat(array);
        MyUtils.print2DIntArray(array);
    }

    // Create Method which reformat 2D array of numbers int in that way
    // that first element in a row is always  minimal element from the row

    //  5 5 6     5  9  6
    //  6 5 7 ->  5  6  7
    //  6 3 7     3  6  7


}
