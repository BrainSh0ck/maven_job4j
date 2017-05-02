package com.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 07.04.2017.
 */
public class PolyCallsMethods {
    static class Parent {
        void test() {
            System.out.println("Parent::test()");
        }

        void testParent() {
            System.out.println("Parent::testParent()");
        }
    }

    static class Child extends Parent {
        @Override
        void test() {
            System.out.println("Child::test()");
        }

        void testChild() {
            System.out.println("Child::testChild");
        }
    }

    public static void main(String[] args) {
        Parent item = new Child();

        System.out.println("Parent -> Child");
        item.test();
        item.testParent();
        // item.testChild(); Ссылка типа Parent -> нет testChild

        System.out.println("Child -> Child");
        Child other = new Child();
        other.test();
        other.testChild();
        other.testParent();

        System.out.println("Collection");
        List<Parent> list = new ArrayList<Parent>();
        list.add(new Child());
        list.add(new Parent());

        for (Parent p : list) {
            p.test();
        }
    }
}
