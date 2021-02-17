package lessons;

import collection.MyQueue;
import function.MyFunction;
import model.Human;
import model.d3.Volume;
import model.geoShapes.Circle;

import java.util.Queue;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.Math.PI;

public class L18Main {
    public static void main(String[] args) {
        Function myFunction = new MyFunction();
        printSomething(myFunction, "F");

        Function anonymousFunction = new Function() {
            @Override
            public Object apply(Object o) {
                System.out.println("Hello from new inline anonymous implementation!");
                return o;
            }
        };
        Function lambdaFunctionEx = (Object o) -> {
            System.out.println("Hello from new inline anonymous implementation!");
            return o;
        };

        printSomething((Object o) -> {
            System.out.println("Hello from new inline anonymous implementation!");
            return o;
        }, "Lambda");

        // 1
        Supplier<Human> humanSupplier1 = new Supplier<Human>() {
            @Override
            public Human get() {
                return new Human();
            }
        };
        // 2
        Supplier<Human> humanSupplier = () -> new Human();
        // 3
        doSomethingSupplier(() -> new Human());
        doSomethingSupplier(() -> new Human("Thomas", "Black", "man"));

        Volume volumeLambdaForSphereWithR5 = () -> (4/3) * PI * 5 * 5 * 5;
        double volume = volumeLambdaForSphereWithR5.getVolume();

        /*doSomethingPredicate((Circle t) -> {t.getPerimeter() > 6.0}, new Circle());

        doSomethingPredicateAndSupplier(t -> t.getPerimeter() > 12.0, Circle::new);*/

    }

    private static void doSomethingPredicateAndSupplier(Predicate<Circle> circlePredicate,
                                                        Supplier<Circle> circleSupplier) {
        //boolean isSquareGT5 = circlePredicate.test(circle);
        if (circlePredicate.test(circleSupplier.get())) {
            System.out.println("Circle Area is greater");
        } else {
            System.out.println("Circle Area is less");
        }
    }

    private static void doSomethingPredicate(Predicate<Circle> circlePredicate, Circle circle) {
        boolean isSquareGT5 = circlePredicate.test(circle);
        if (isSquareGT5) {
            System.out.println("Circle Square is greater");
        } else {
            System.out.println("Circle Square is less");
        }
    }

    private static void printSomething(Function function, Object o) {
        function.apply(o);
        System.out.println(o);
    }

    private static void doSomethingSupplier(Supplier<Human> humanSupplier) {
        System.out.println("Hello from doSomethingSupplier! Need a nigger slave!");
        Human suppliedHuman = humanSupplier.get();
        System.out.println(suppliedHuman);
    }
}
