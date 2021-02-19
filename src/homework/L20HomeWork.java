package homework;

import model.CargoCar;
import model.Color;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import static java.util.stream.Stream.iterate;


public class L20HomeWork {

    public static void main(String[] args) {

        /*List<CargoCar> cars = generateCars(1000000);
        cars.parallelStream();*/

        Stream<CargoCar> stream = generateStreamOfCars(100);

        long amountOldet5Years = stream
                .filter(car -> car.getAge() > 20)
                .count();

        System.out.println(amountOldet5Years);


        generateStreamOfCars(2)
                .filter(car -> car.getColor() == Color.RED)
                .mapToInt(CargoCar::getPrice)
                .average()
                .ifPresent((ap) -> System.out.println("Average Price for Red cars:" + ap));

        CargoCar cargoCar = null;

        if (cargoCar != null) {
            System.out.println("Car age: " + cargoCar.getAge());
        } else {
            cargoCar = new CargoCar();
        }
        Optional<CargoCar> carOptional = Optional.of(null);

        boolean isEmpty = carOptional.isEmpty();
        boolean isPresent = carOptional.isPresent();
        carOptional.ifPresent(car -> System.out.println("Car age: " + car.getAge()));

        CargoCar carFromOptional = carOptional.get();
        CargoCar elseCar = carOptional.orElse(new CargoCar());
        CargoCar elseGetCar = carOptional.orElseGet(() -> new CargoCar());
        CargoCar elseThrowCar = carOptional.orElseThrow(() -> new RuntimeException());


    }

    private static Stream<CargoCar> generateStreamOfCars(int count) {
        return iterate(new CargoCar(), t -> new CargoCar()).limit(count);
    }


    private static List<CargoCar> generateCars(int count) {
        List<CargoCar> result = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            result.add(new CargoCar());
        }
        return result;
    }
}
