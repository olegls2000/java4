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
public class Lesson14Main {
    public static void main(String[] args) throws Exception {
        Object obj = new Circle();

        final Class aClass = obj.getClass();
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

        List<Circle> circles = generateCircles(999);
        List<Human> humans = generateHuman(500);

        List<Object> objects = generateObjects(200000, Circle.class);
        List<Object> objectsH = generateObjects(2, Human.class);

        callSecretMethod(new Circle());
        callSecretMethod(new Human());
        Human hh = new Human();

    }


    static List<Object> generateObjects(int count, Class clazz) throws Exception{
        List results = new ArrayList<>();
        final Constructor defaultConstructor = getDefaultConstructor(clazz);
        for (int i = 0; i < count; i++) {
            results.add(defaultConstructor.newInstance());
        }
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
