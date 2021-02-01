package Lessons;

import Model.GeoShapes.SimpleTriangle;

public class L6Main {
    public static void main(String[] args) {
        /*Student syt1 = new Student("F", "Y");
        Square square = new Square(9);
        Model.Human humanModel = new Model.Human("", "", "");
        MyUtils.getRandomFromRange(89, 99);*//*


        Class classLink = Student.class;
        String className = classLink.getName();
        String classSimpleName = classLink.getCanonicalName();
        System.out.println(classSimpleName);
        System.out.println(className);

        Human hh = null;
        int i1 = getRandomFromRange(98, 99);
        int i2 = getRandomFromRange(98, 99);
        int i3 = getRandomFromRange(98, 99);
        int i4 = getRandomFromRange(98, 99);
        int i5 = getRandomFromRange(98, 99);
        int i6 = getRandomFromRange(98, 99);
        int i9 = getRandomFromRangeY(98, 99);

        System.out.println("daysInWeek: " + DAYS_IN_WEEK);
        //daysInWeek = 9;
        System.out.println("Pi: " + PI);

        final int MY_CONSTANT = 99;
        final Student STUDENT_CONSTANT = new Student("Ivan", "Ivanov");

        STUDENT_CONSTANT.age = 999;
        STUDENT_CONSTANT.name = "999";
        System.out.println(STUDENT_CONSTANT);

        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("Today is working day: " + today.isWorking);
        System.out.println("Day order: " + today.order);
        System.out.println("Day name: " + today.name);

        DayOfWeek dateByEnumDate = Enum.valueOf(DayOfWeek.class, "SUNDAY");
        System.out.println(dateByEnumDate);

        Human human = new Human("I", "D", "");
        String fn = human.getFirstName();
        human.setFirstName("newFn");
        System.out.println(human.getFirstName());*/

        // System.err.println(); -> writes in red and continues code.

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

        SimpleTriangle smallestPerimeterTriangle = getSmallestTriangle(triangles);
        System.out.println(smallestPerimeterTriangle.getTrianglePerimeter());
    }

    private static SimpleTriangle getSmallestTriangle(SimpleTriangle[] triangles)
    {
        SimpleTriangle result = triangles[0];
        for (SimpleTriangle triangle : triangles)
        {
            if (triangle.getTrianglePerimeter() < result.getTrianglePerimeter())
            {
                result = triangle;
            }
        }
        return result;
    }
}