package lessons;

import function.HumanIvanSupplier;
import function.MyAbstractClassF;
import model.Human;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static utils.MyUtils.generateList;
import static utils.MyUtils.getRandomFromRange;

public class L19Main {
    public static void main(String[] args) {
        if (6 != 8) System.out.println("FALSE");


        Supplier<Human> hSupplier = new HumanIvanSupplier();
        final Human human1 = hSupplier.get();
        final Human human2 = hSupplier.get();

        Supplier<Human> petrSupplier = new Supplier<Human>() {
            @Override
            public Human get() {
                Human result = new Human();
                result.setFirstName("Petr");
                return result;
            }
        };
        final Human petr1 = petrSupplier.get();
        final Human petr2 = petrSupplier.get();

        Supplier<Human> petrSupplierLambda = () -> {
            Human result = new Human();
            result.setFirstName("Petr");
            return result;
        };
        MyAbstractClassF lambdaRepres1 = (String x) -> {
            System.out.println(x.length());
            System.out.println(x.length() + 1);
        };
        MyAbstractClassF lambdaRepres2 = (String x) -> System.out.println("X" + x.length());
        MyAbstractClassF lambdaRepres3 = (y) -> System.out.println("Y" + y.length());
        MyAbstractClassF lambdaRepres4 = z -> System.out.println("Z" + z.length());

        lambdaRepres2.myAbstractMeth("7");
        lambdaRepres3.myAbstractMeth("7");
        lambdaRepres4.myAbstractMeth("7");

        printReport(petrSupplier);

        printReport(hSupplier);

        printReport(() -> {
            Human result = new Human();
            result.setLastName("YYY");
            return result;
        });


        List<Integer> integers = generateList(10, 0, 5);
        List<Integer> evenList = new ArrayList<>();
        for (Integer item : integers) {
            if (item % 2 == 0) {
                evenList.add(item);
            }
        }
        Predicate<Integer> evenPredicate = (Integer t) -> {
            return t % 2 == 0;
        };

        long evenCount =
                integers.stream()
                        .filter(evenPredicate)
                        .count();
        System.out.println("Even count = " + evenCount);


    }

    static void printReport(Supplier<Human> supplier) {
        if (getRandomFromRange(1, 10) % 2 == 0) {
            System.out.println("Report: " + supplier.get());
        }
    }


}

