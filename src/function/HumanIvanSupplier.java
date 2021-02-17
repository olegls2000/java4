package function;

import model.Human;

import java.util.function.Supplier;

public class HumanIvanSupplier implements Supplier<Human> {

    @Override
    public Human get() {
        Human result = new Human();
        result.setFirstName("Ivan");
        return result;
    }
}
