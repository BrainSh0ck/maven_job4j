package com.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by root on 08.04.2017.
 */
public class Reflection {
    public static void main(String[] args) throws Exception {
        Class clazz = Test.class;
        Test test = (Test) clazz.newInstance();

        // методы отрефлекченного мета класса Test.class
        clazz.getConstructors();
        //clazz.getAnnotatedSuperclass()

        // вызываем метод по имени у заданного объекта
        Method method = clazz.getMethod("foo");
        System.out.println(method.toString());
        method.invoke(test);

        // установить поле по имени у заданого объекта
        Field field0 = clazz.getDeclaredField("field");
        field0.setAccessible(true);
        field0.set(test, 100);
        System.out.println(test);

        //выводим название пакета
        Package pack = clazz.getPackage();
        System.out.println(pack.getName());

        //декларация класса модификаторов
        int mod = clazz.getModifiers();
        System.out.println(getModifiers(mod));


        //название класса
        System.out.println("Class name: " + clazz.getSimpleName() + " ");

        //назваение родительского класса
        System.out.println("Super class name: " + clazz.getSuperclass().getSimpleName() + " ");

        // интерфейсы которые реализует класс
        Class[] interfaces = clazz.getInterfaces();
        System.out.println(clazz.getSimpleName() + " implements: ");
        for (Class p : interfaces) {
            System.out.println(p.getSimpleName() + ",");
        }
        System.out.println("{");

        // поля класса
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\t" + getModifiers(field.getModifiers()) + getType(field.getType()) + field.getName() + ";");
        }

        // выводим конструторы класса
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("\t" + getModifiers(c.getModifiers()) + clazz.getSimpleName() + "(");
            System.out.println(getParameters(c.getParameterTypes()));
            System.out.println(") { } ");
        }
        //выводим методы класса
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] annotations = m.getAnnotations();
            System.out.println("\t");
            for (Annotation a : annotations) {
                System.out.println("@" + a.annotationType().getSimpleName() + " ");
            }
            //System.out.println();
            System.out.print("\t" + getModifiers(m.getModifiers()) +
                    getType(m.getReturnType()) + " " + m.getName() + "(");
            System.out.print(getParameters(m.getParameterTypes()));
            System.out.print(") { }");
        }
        System.out.println();
        System.out.println("}");
    }

    static String getType(Class clazz) {
        String type = clazz.isArray() ? clazz.getComponentType().getSimpleName() + " " : clazz.getSimpleName() + " ";
        if (clazz.isArray()) {
            type += "[]";
        }
        return type;
    }

    static String getModifiers(int mod) {
        String modifiers = "";
        if (Modifier.isPublic(mod)) {
            modifiers += "public ";
        }
        if (Modifier.isProtected(mod)) {
            modifiers += "protected ";
        }
        if (Modifier.isPrivate(mod)) {
            modifiers += "private  ";
        }
        if (Modifier.isStatic(mod)) {
            modifiers += "static ";
        }
        if (Modifier.isAbstract(mod)) {
            modifiers += "abstract ";
        }
        return modifiers;
    }

    static String getParameters(Class[] params) {
        String param = "";
        for (Class cl : params) {
            if (cl.isPrimitive()) {
                cl.toString();
            } else cl.toString();
            param += cl + ",";
        }
        return param;
    }
}
