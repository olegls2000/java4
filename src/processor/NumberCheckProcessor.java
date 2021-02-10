package processor;

import annotation.NumberCheck;

import java.lang.reflect.Field;

public final class NumberCheckProcessor {

    private NumberCheckProcessor() {
    }

    private static NumberCheckProcessor instance;

    public static final NumberCheckProcessor getInstance() {
        if (instance == null) {
            instance = new NumberCheckProcessor();
        }
        return instance;
    }

    public void process(Object objectToProcess) {
        final Class<?> clazz = objectToProcess.getClass();
        final Class<?> superClazz = clazz.getSuperclass();
        Field[] superFields = superClazz.getDeclaredFields();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : superFields) {
            boolean isAnnotationPresent = field.isAnnotationPresent(NumberCheck.class);
            if (!isAnnotationPresent) {
                continue;
            }
            Object rawValue;
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
            int min = annotation.min();
            int max = annotation.max();
            if (value < min || value > max) {
                throw new RuntimeException("Value must be mote than " + min + "and less than " + max);
            }
        }
    }
}

