package lessons;


import model.Circle;
import model.Human;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static utils.ReflectionUtils.callSecretMethod;
import static utils.ReflectionUtils.getDefaultConstructor;

//Reflection:
public class L14Main {
    public static void main(String[] args) throws Exception {
        Object obj = new Circle();

        final Class<?> aClass = obj.getClass();
        System.out.println(aClass.getCanonicalName());
        final Method[] methods = aClass.getMethods();
        System.out.println(aClass.getMethods().length);
        Method method1 = methods[0];
        System.out.println(method1.getName());
        System.out.println(method1.getReturnType());
        System.out.println(method1.getExceptionTypes());
        System.out.println(method1.getParameterCount());
        System.out.println(method1.getModifiers());

        Class comeClass = Circle.class;
        final Constructor[] constructors = comeClass.getConstructors();
        Object newObject = constructors[0].newInstance();

        List<Circle> circles = generateCircles(9);
        List<Human> humans = generateHuman(5);

        List objects = generateObjects(20, Circle.class);
        List<Object> objectsH = generateObjects(2, Human.class);

        final List<Human> humans1 = generateCertainObjects(20, Human.class);
        List<Circle> circlesG = generateCertainObjects(20, Circle.class);
        final List<Integer> integerList = generateCertainObjects(20, Integer.class);

        callSecretMethod(new Human());
        callSecretMethod(new Circle());
        Human hh = new Human();
    }


    static List<Object> generateObjects(int count, Class clazz) throws Exception {
        List results = new ArrayList<>();
        final Constructor defaultConstructor = getDefaultConstructor(clazz);
        for (int i = 0; i < count; i++) {
            results.add(defaultConstructor.newInstance());
        }
        return results;
    }

    static <PH>  List<PH> generateCertainObjects(int count, Class<PH> clazz) throws Exception {
        List<PH> results = new ArrayList<>();
        final Constructor<PH> defaultConstructor = getDefaultConstructor(clazz);
        for (int i = 0; i < count; i++) {
            results.add(defaultConstructor.newInstance());
        }
        //List<PH> xx = new ArrayList<>();

        return results;
    }


    static List<Circle> generateCircles(int n) {
        List<Circle> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            results.add(new Circle());
        }
        return results;
    }

    static List<Human> generateHuman(int n) {
        List<Human> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            results.add(new Human());
        }
        return results;
    }
}
