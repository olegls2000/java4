package function;

import java.util.function.Function;

public class MyFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String o) {
        System.out.println("Hello From Function!!" + o);
        return 5;
    }
}
