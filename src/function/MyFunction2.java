package function;

import java.util.function.Function;

public class MyFunction2 implements Function<String, Integer> {
    @Override
    public Integer apply(String t) {
        System.out.println("Hello From Function2!!");
        System.out.println("Hello From Function2!!");
        return 99;
    }
}
