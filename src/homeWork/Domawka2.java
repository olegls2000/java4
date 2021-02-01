package homeWork;

import utils.MyUtils;

public class Domawka2 {
    public static void main(String[] args) {
        // 1 assignment
        int a = MyUtils.randomNumberFromRange();
        int b = MyUtils.randomNumberFromRange();
        int c = MyUtils.randomNumberFromRange();
        System.out.println("Max value from: " + a + ", " + b + ", " + + c + " is " + MyUtils.maxNumber(a, b, c));
        // 2 assignment
        System.out.println("Random number from range -0.5 to 0.9 is " + MyUtils.randomDoubleNumberFromRange(-0.5, 0.9));
        // 3 assignment
        int number = MyUtils.randomNumberFromRange();
        System.out.println("Highest digit in " + number + " is " + MyUtils.highestDigitInNumber(number));
        // 4 assignment
        MyUtils.equationSolution(1, -2, -3);
    }

}
