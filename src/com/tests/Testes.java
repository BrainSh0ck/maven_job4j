package com.tests;

/**
 * Created by root on 09.04.2017.
 */
public class Testes {
    public static void main(String[] args) {
        String name = "Dog";
        change(name);
        System.out.println(name);
        name = change(name);
        System.out.println(name);
        int[] a;
        //b = new int[];
        //System.arraycopy();
        int count = 0;
        while (count < 5) {
            count++;
        }
        System.out.println(count);
        int b = (byte)(-128 - 1);
        System.out.println(b);
        System.out.println(1 + 2 + " " + 3 + 4);
        System.out.printf("%s%s,I am %d years old", "boy", "Hello", 12);
    }

    public static String change(String name) {
        name = name + "Cat";
        String surname = "Kotov";
        return surname;

    }
}
