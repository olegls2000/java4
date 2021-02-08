package homework;

import java.lang.reflect.Constructor;

public class L14HomeWork {

    public static void main(String ... args) throws Exception {
        if (args[0].contains("PROD")) {
            System.out.println("Hello from PROD");
        }
        if (args[0].contains("DEV")) {
            System.out.println("Hello from DEV");
        }
        ReflHomeWork newObject = generateByAllArgsConstructor(ReflHomeWork.class, 10, "F");
        System.out.println(newObject);
        ReflHomeWork2 newObject2 = generateByAllArgsConstructor(ReflHomeWork2.class, 2.0, 5.0, "F");
        System.out.println(newObject2);
        //newObject.
    }

    private static <T> T generateByAllArgsConstructor(Class<T> clazz, Object  ... parameters)
            throws Exception {
        Constructor[] constructors = clazz.getConstructors();
        Constructor<T> constructor = constructors[0];
        return constructor.newInstance(parameters);
    }
}
