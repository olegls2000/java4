package lessons;

import model.Human;
import model.geoShapes.Circle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static utils.ReflectionUtils.callSecretMethod;
import static utils.ReflectionUtils.getDefaultConstructor;

public class L14Main {
    public static void main(String[] args) throws Exception {
        // Reflection:

        //Object obj = new Circle();

        /*final Class<?> aClass = obj.getClass();
        System.out.println(aClass.getName());
        final Method[] methods = aClass.getMethods();
        System.out.println(aClass.getMethods().length);
        Method method1 = methods[0];
        System.out.println(method1.getName());
        System.out.println(method1.getReturnType());
        System.out.println(method1.getExceptionTypes());
        System.out.println(method1.getParameterCount());
        System.out.println(method1.getModifiers());

        Class someClass = Circle.class;
        final Constructor[] constructors = someClass.getConstructors();
        Object newObj = constructors[0].newInstance();

        List<Circle> circles = generateCircles(10);

        List<Object> objectO = generateObjects(3, Circle.class);*/

        callSecretMethod(new Human());
    }


    static List<Circle> generateCircles(int n)
    {
        List<Circle> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            results.add(new Circle());
        }
        return results;
    }

    static List<Object> generateObjects(int count, Class clazz) throws Exception
    {
        List results = new ArrayList<>();
        final Constructor defaultConstructor = getDefaultConstructor(clazz);
        for (int i = 0; i < count; i++) {
            results.add(defaultConstructor.newInstance());
        }
        return results;
    }

    // T -> TYPE (PLACEHOLDER)
    static <T> List<T> generateCertainObjects(int count, Class<T> clazz) throws Exception
    {
        List<T> results = new ArrayList<>();
        final Constructor<T> defaultConstructor = getDefaultConstructor(clazz);
        for (int i = 0; i < count; i++) {
            results.add(defaultConstructor.newInstance());
        }
        return results;
    }

}
