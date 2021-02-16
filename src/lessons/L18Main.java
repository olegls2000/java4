package lessons;

import collection.MyQueue;
import function.MyFunction;
import function.MyFunction2;
import model.Circle;
import model.Human;
import model.d3.WithVolume;

import java.util.Queue;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static model.d3.WithVolume.PI;

//Collection Queue Implementation
public class L18Main {
    public static void main(String[] args) {
        Queue<Circle> myQueue = new MyQueue<>();
        Circle circle1 = new Circle();
        myQueue.add(circle1);

        Circle circle2 = new Circle();
        myQueue.add(circle2);

        Circle circle3 = new Circle();
        myQueue.add(circle3);

        System.out.println("My Queue: " + myQueue);
        myQueue.remove(circle2);

        System.out.println("My Queue: " + myQueue);


        //Separate Implementation example:
        Function<String, Integer> myFunction = new MyFunction();
        printSmt(myFunction, "F");

        Function<String, Integer> myFunction2 = new MyFunction2();
        printSmt(myFunction2, "F2");

        //Anonymous implementation example:
        Function<String, Integer> myFunction3 = new Function<String, Integer>() {
            @Override
            public Integer apply(String o) {
                System.out.println("Hello From Anonymous implementation!");
                return 88;
            }
        };

        printSmt(myFunction3, "An");

        printSmt(new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                System.out.println("Hello From Inline Anonymous implementation!");
                return 1000;
            }
        }, "Inline An");

        printSmt(new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                System.out.println("Hello From New Inline Anonymous implementation!");
                return 33;
            }
        }, "Inline An");

        Function anFunction = t -> {
            System.out.println("Hello From New Inline Anonymous implementation!");
            return t;
        };

        Function<String, Integer> lambdaFunctionEx = (String t) -> {
            System.out.println("Hello From  Lambda implementation!");
            return 3;
        };

        printSmt(lambdaFunctionEx, "Lambda");

        printSmt((String t) -> {
            System.out.println("Hello From  Lambda implementation!");
            return 66;
        }, "Lambda Inline");

        Function<String, Integer> funcExample = (String t) -> {
            System.out.println("asdsa");
            return 14;
        };
        Function<String, Integer> funcExample1 = t -> 14;
        printSmt(t -> 14, "TEST");

        //1
        Supplier<Human> humanSupplierL = new Supplier<Human>() {
            @Override
            public Human get() {
                return new Human();
            }
        };
        //2
        Supplier<Human> humanSupplierM = () -> new Human();
        //3
        doSmthWithSupplier(() -> new Human());

        doSmthWithSupplier(() -> new Human("Ivan", "Ivanov", "men"));

        WithVolume volumeLambdaForSphereWitR5 = () -> (4 / 3) * PI * 6 * 6 * 6;
        double volume = volumeLambdaForSphereWitR5.getVolume();

        doSmthWithPredicate(t -> t.calculateArea() > 6.0, new Circle());
        doSmthWithPredicate(t -> t.calculateArea() > 10.0, new Circle());

        doSmthWithPredicateAndSupplier(t -> t.calculateArea() > 12.0, Circle::new);

    }

    private static void doSmthWithPredicateAndSupplier(Predicate<Circle> circlePredicate,
                                                       Supplier<Circle> circleSupplier) {
        //boolean isSquareGT = circlePredicate.test(circle);
        if (circlePredicate.test(circleSupplier.get())) {
            System.out.println("Circle Area is greater");
        } else {
            System.out.println("Circle Area is less");
        }
    }


    private static void doSmthWithPredicate(Predicate<Circle> circlePredicate, Circle circle) {
        //boolean isSquareGT = circlePredicate.test(circle);
        if (circlePredicate.test(circle)) {
            System.out.println("Circle Area is greater");
        } else {
            System.out.println("Circle Area is less");
        }
    }


    private static void doSmthWithSupplier(Supplier<Human> humanSupplier) {
        System.out.println("Hello fom doSmthWithSupplier()...");
        Human suppliedHuman = humanSupplier.get();
        System.out.println(suppliedHuman);
    }


    private static void printSmt(Function<String, Integer> function, String o) {
        function.apply(o);
        System.out.println(o);
    }
}
