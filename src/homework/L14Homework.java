package homework;

import model.ReflectionHomework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class L14Homework {
    public static void main(String[] args)
            throws Exception {
        Object object = getClassObject("Kitty", 6);
        getFieldName(object);
        System.out.println(getFieldValue(object, "surname"));
    }

    static Object getClassObject(String surname, int amount)
            throws Exception {
        Class reflectionClass = ReflectionHomework.class;
        Constructor[] constructors = reflectionClass.getConstructors();
        Object reflectionObject = constructors[0]
                .newInstance(surname, amount);
        return reflectionObject;
    }

    static void getFieldName(Object object)
    {
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) // enumeration
        {
            System.out.println(field.getName());
        }
    }

    static Object getFieldValue(Object object, String attributeName)
            throws IllegalAccessException {
        Class objectClass = object.getClass();
        Field field = null;
        Field[] fields = objectClass.getDeclaredFields();
        for (int i = 0; i < fields.length ; i++) // for manipulating
        {
            if (fields[i].getName().contains(attributeName))
            {
                field = fields[i];
                break;
            }
        }
        if (field == null)
        {
            throw new IllegalArgumentException("Attribute not found!");
        }
        field.setAccessible(true);
        return field.get(object);
    }
}