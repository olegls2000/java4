package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class ReflectionUtils {
    private ReflectionUtils() {
        throw new RuntimeException("Don't try to instantiate Utils Class!!!");
    }

    public static Constructor getDefaultConstructor(Class clazz) throws Exception {
        Constructor[] constructors = clazz.getConstructors();
        Constructor defaultConstructor = null;
        for (Constructor constructor : constructors) {
            if (constructor.getParameterCount() == 0) {
                defaultConstructor = constructor;
                break;
            }
        }
        if (defaultConstructor == null) {
            throw new Exception("Class " + clazz.getName() + "doesn't have default constructor");
        }
        return defaultConstructor;
    }

    public static void callSecretMethod(Object obj) throws Exception {
        Class clazz = obj.getClass();
        // get all methods
        Method[] methods = clazz.getDeclaredMethods();
        // find method with a secret
        Method secretMethod = null;
        for (Method method : methods) {
            //"someSecretMethod"  or "secretMethod"
            if (method.getName().toLowerCase().contains("secret")) {
                secretMethod = method;
                break;
            }
        }
        // invoke method or say that method is absent
        if (secretMethod == null) {
            System.out.println("No Secret Methods!!!");
        } else {
            secretMethod.setAccessible(true);
            secretMethod.invoke(obj);
        }
    }
}
