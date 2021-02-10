package processor;

import annotation.NumberCheck;

import java.lang.reflect.Field;

public class NumberCheckProcessor {

    public void process(Object objectToProcess) {
        final Class<?> clazz = objectToProcess.getClass();
        final Class<?> superclazz = clazz.getSuperclass();
        Field[] superFields = superclazz.getDeclaredFields();
        Field[] fields = clazz.getFields();


        for (Field field : fields) {
            boolean isAnnotationPresent = field.isAnnotationPresent(NumberCheck.class);
            if (!isAnnotationPresent) {
                continue;
            }
            Object rawValue = null;
            try {
                field.setAccessible(true);
                rawValue = field.get(objectToProcess);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            if (!(rawValue instanceof Integer)) {
                continue;
            }
            Integer value = (Integer) rawValue;
            NumberCheck annotation = field.getAnnotation(NumberCheck.class);
            int max = annotation.max();
            int min = annotation.min();


            if (value < min || value > max) {
                throw new RuntimeException("Value must be more than " +min + " less than "+ max);
            }
        }
    }
}

