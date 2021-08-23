package ru.bulkashmak;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Casino casino = new Casino();

        Method[] methods = casino.getClass().getMethods();
        for(Method method : methods) {
            if (method.isAnnotationPresent(Startup.class)) {
                Object obj = method.invoke(casino);
            }
        }
    }
}
