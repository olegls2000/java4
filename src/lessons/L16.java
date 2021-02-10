package lessons;

import java.util.ArrayList;
import java.util.List;

import static utils.MyUtils.getRandomFromRange;

public class L16 {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, getRandomFromRange(0, 100));
        numbers.add(1, getRandomFromRange(0, 100));
        numbers.add(2, getRandomFromRange(0, 100));
        numbers.add(3, getRandomFromRange(0, 100));
        numbers.add(4, getRandomFromRange(0, 100));
        numbers.add(5, getRandomFromRange(0, 100));
        numbers.add(6, getRandomFromRange(0, 100));
        numbers.add(7, getRandomFromRange(0, 100));
        numbers.add(8, getRandomFromRange(0, 100));
        numbers.add(9, getRandomFromRange(0, 100));
        for (Integer iterator : numbers) {
            if (iterator % 2 == 0) {
                System.out.println(iterator);
            }
        }
    }
}