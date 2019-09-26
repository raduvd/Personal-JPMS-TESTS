package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

    public static void main (String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println("-------------------BEFORE");
        Class<?> type = Class.forName("packa.Type");
        Object o = type.newInstance();
        System.out.println("-------------------AFTER");
       /* Constructor<?> constructor = entityType.getConstructor();
        constructor.setAccessible(true);
        Object entity = constructor.newInstance();
        Field id = entity.getDeclaredField("id");
        id.setAccessible(true);
        id.set(entity, 42);*/
    }

}
