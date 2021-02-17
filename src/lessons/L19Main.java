package lessons;

import function.HumanIvanSupplier;
import function.MyAbstractClassF;
import model.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        Stream<String> stream = integers.stream()
                .filter(t -> t % 2 == 0)
                .peek(t -> System.out.println("even: " + t))
                .map(t -> t.toString());

        stream.peek(t -> System.out.println(t));

        //long count = stream.count();
        //stream.count();
        //System.out.println("Even count = " + count);

        Set<String> strings =
                generateList(10, 0, 5)
                        .stream()
                        .map(t -> t.toString())
                        .collect(Collectors.toSet());


        boolean has666 = generateList(100, 0, 800)
                .stream()
                .anyMatch(t -> t == 666);

        Integer i = Integer.valueOf(10);
        String iString = i.toString();
        Integer iRestored = Integer.valueOf(iString);

        final List<Integer> singleDigitList =
                generateList(100, 0, 10)
                        .stream()
                        //.map(t -> "Hello" + t.toString())
                        .map(Objects::toString)
                        .filter(t -> t.length() == 1)
                        //.peek(t -> System.out.println(t))
                        .peek(System.out::println)
                        //.map(t -> Integer.valueOf(t))
                        .map(Integer::valueOf)
                        .collect(Collectors.toList());





        // stream
        //map  i.toString()
        //filter length  == 1
        //map Integer.valueOf(iString);
        // peek sout
        //collect  (Collectors.toList());

    }

    static void printReport(Supplier<Human> supplier) {
        if (getRandomFromRange(1, 10) % 2 == 0) {
            System.out.println("Report: " + supplier.get());
        }
    }


}

