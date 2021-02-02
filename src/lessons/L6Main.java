package lessons;

import model.*;

import static java.lang.Math.PI;
import static utils.MyUtils.*;

public class L6Main {
    public static void main(String[] args) {


        Class classLink = Student.class;
        String className = classLink.getName();
        String classSimpleName = classLink.getSimpleName();
        System.out.println("classSimpleName: " + classSimpleName);
        System.out.println("className: " + className);

        Human hh = null;

        Square sq = null;

        int i1 = getRandomFromRange(98, 99);
        int i2 = getRandomFromRange(98, 99);
        int i3 = getRandomFromRange(98, 99);
        int i4 = getRandomFromRange(98, 99);
        int i5 = getRandomFromRange(98, 99);
        int i6 = getRandomFromRange(98, 99);

        int i9 = getRandomFromRangeX(98, 99);

        System.out.println("daysInWeek:" + DAYS_IN_WEEK);
        //daysInWeek = 9;
        System.out.println("Pi:" + PI);

        final int MY_CONSTANT = 99;
        final Student STUDENT_CONSTANT = new Student("Ivan", "Ivanov");
        STUDENT_CONSTANT.age = 999;
        STUDENT_CONSTANT.name = "999";
        System.out.println(STUDENT_CONSTANT);
        //STUDENT_CONSTANT = null;
        DayOfWeek today = DayOfWeek.SUNDAY;

        System.out.println("Today is working Day: " + today.isWorking);
        System.out.println("Day order: " + today.order);
        System.out.println("Day name: " + today.name);

        DayOfWeek[] allPossibleValues = DayOfWeek.values();
        System.out.println(allPossibleValues.length);

        DayOfWeek dateByEnumName = Enum.valueOf(DayOfWeek.class, "SUNDAY");
        System.out.println(dateByEnumName);

        Human human = new Human("I", "D", "");
        String fn = human.getFirstName();
        human.setFirstName("newFn");
        //System.err.println("System.err.print");
        SimpleTriangle triangle1 = new SimpleTriangle(5, 6, 9);
        triangle1.setA(10);
        triangle1.setB(9);
        triangle1.setC(7);

        System.out.println(triangle1);
        SimpleTriangle[] triangles = {new SimpleTriangle(5, 6, 9),
                new SimpleTriangle(5, 6, 9),
                new SimpleTriangle(5, 8, 9),
                new SimpleTriangle(9, 6, 9)
        };

        SimpleTriangle smallestPerimTr = getSmalletPerimTriangle(triangles);
        System.out.println(smallestPerimTr.getPerim());

    }

    //find out a Triangle with the smallest Perimetr. Use For Each Loop!
    private static SimpleTriangle getSmalletPerimTriangle(SimpleTriangle[] triangles) {
        SimpleTriangle result = triangles[0];
        for (SimpleTriangle triangle : triangles) {
            if (triangle.getPerim() < result.getPerim()) {
                result = triangle;
            }
        }
        return result;
    }
}
