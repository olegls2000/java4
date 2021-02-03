package lessons;

import model.*;
import model.geoShapes.Square;
import model.Student;
import utils.MyUtils;

public class L5Main {
    public static void main(String[] args) {
        Student joe = new Student("Joe", "B");
        joe.getOneYearOlder();

        Square sq1 = new Square();
        Square sq2 = new Square();
        Square sq3 = new Square();
        Square sq4 = new Square();

        Square[] squares = {sq1, sq2, sq3, sq4};
        Square maxPerimSquare = squares[0];
        for (int i = 0; i < squares.length; i++) {
            if (squares[i].getPerimeter() > maxPerimSquare.getPerimeter()) {
                maxPerimSquare = squares[i];
            }
        }
        System.out.println("Max perimetr: " + maxPerimSquare.getPerimeter());

        Human nik = new Human("Nik", "Nikolaev", "male");
        Human viktorija = new Human("Viktorija", "Viktorova", "female");

        nik.marriage(viktorija);

        sq1.getPerimeter();
        MyUtils.getRandomFromRange(8, 55);
        int mod = Math.abs(-9);
        //ArrayUtil.arrayToString(squares);
        //System.out.println();

        Human h1 = new Human("X", "X", "x");
        mutateObject(h1);

        int i = 9;
        i = mutateValue(i);

        Integer iWrapper = new Integer(9);
        Integer iWrapperX = 9;
        Long l = new Long(9l);
        Double d = new Double(9l);
        Integer iWrapperM = mutateWrapper(iWrapper);

        Boolean bWrapper;
        boolean bPrim;

        System.out.println("i = " + i);
        System.out.println("iWrapperM = " + iWrapperM);
        System.out.println("Human.lastName =" + h1.getLastName());

        String str = "pp";
        String newStr = str.concat("TT");

        System.out.println("newStr = " + newStr);
        System.out.println("str = " + str);

        double averagePerim = calculateAveragePerimetr(squares);
        System.out.println("Average Perim = " + averagePerim);
    }

    public static void mutateObject(Human human) {
        human.setLastName("newLn");
    }

    public static int mutateValue(int value) {
        value--;

        return value;
    }

    public static Integer mutateWrapper(Integer wrapInt) {
        //wrapInt --;
        Integer result = wrapInt - 1;


        //return wrapInt;
        return result;
    }

    public static double calculateAveragePerimetr(Square[] squares) {
        int summ = 0;
        for (Square sq : squares) {
            //summ = summ + square.calculatePerimetr();
            summ += sq.getPerimeter();
        }

        return summ / squares.length;
    }

}