package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class ReflectionUtils {
    private ReflectionUtils() {
        throw new RuntimeException("Don't even try!");
    }

    public static Constructor getDefaultConstructor(Class clazz) throws Exception
    {
        Constructor[] constructors = clazz.getConstructors();
        Constructor defaultConstructor = null;
        for (Constructor constructor : constructors)
        {
            // if several constructors have 2 parameters, but with different types.
                /*final Class[] parameterTypes = constructor.getParameterTypes();
                System.out.println(parameterTypes);*/
            if (constructor.getParameterCount() == 0)
            {
                defaultConstructor = constructor;
                break;
            }
        }
        if (defaultConstructor == null)
        {
            throw new Exception("Class " + clazz.getName() + "doesn't have a default constructor!");
        }
        return defaultConstructor;
    }

    public static void callSecretMethod(Object obj) throws Exception
    {
        final Class clazz = obj.getClass();
        Method secretMeth = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods)
        {
           if (method.getName().toLowerCase().contains("secret"))
           {
               secretMeth = method;
               break;
           }
        }
        if (secretMeth == null)
        {
            throw new Exception("No secret method found!");
        }
        else
        {
            secretMeth.setAccessible(true);
            secretMeth.invoke(obj);
        }
    }
}