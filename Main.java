package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchFieldException {
	// write your code here

        Class<?> cls = Container.class;
        Container obj = new Container();
        String path = cls.getAnnotation(SaveTo.class).path();
        //String textContainer = obj.text;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method: methods) {
            if (method.isAnnotationPresent(Saver.class)){
                System.out.println("Text saved!");
                method.invoke(obj,path);
                }
        }
    }
}
