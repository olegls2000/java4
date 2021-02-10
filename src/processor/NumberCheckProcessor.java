package processor;

import annotation.NumberCheck;

import java.lang.reflect.Field;

public class NumberCheckProcessor {
    public void process(Object objectProcess) {
        final Class<?> clazz = objectProcess.getClass(); //  <?> wildcard
        final Class<?> superClass = clazz.getSuperclass();
        Field[] superFields = superClass.getDeclaredFields();
        Field[] fields = clazz.getFields();
        for (Field field : superFields)
        {
            boolean isAnnotationPresent =
                    field.isAnnotationPresent(NumberCheck.class);
            if (!isAnnotationPresent)
            {
                continue;
            }
            Object rawValue;

            try {
                field.setAccessible(true);
                rawValue = field.get(objectProcess);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            if (!(rawValue instanceof Integer))
            {
                continue;
            }
            Integer value = (Integer) rawValue;
            NumberCheck annotation = field.getAnnotation(NumberCheck.class);
            int min = annotation.max();
            int max = annotation.min();
            if (value < min || value > max)
            {
                throw new RuntimeException("Value must be more than " + min + " and less than " + max);
            }
        }

    }
}
