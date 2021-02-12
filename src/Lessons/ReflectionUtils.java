package Lessons;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class ReflectionUtils {

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
            //.....

            Method mm = null;
            mm.invoke(obj);
        }
    }

