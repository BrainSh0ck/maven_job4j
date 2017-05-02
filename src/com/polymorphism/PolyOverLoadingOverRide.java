package com.polymorphism;

/**
 * Created by root on 07.04.2017.
 */
public class PolyOverLoadingOverRide {
    ///////////////// переопределение
    static class Parent {
        void test() {
            System.out.println("Parent::test()");
        }
    }

    static class Child extends Parent {
        @Override
        void test() {
            System.out.println("Child::test()");
        }
    }

    //////////////// перегрузка
    static void use(Parent item) {
        System.out.println("use::Parent");
        item.test();
    }

    static void use(Child item) {
        System.out.println("use::Child");
        item.test();
    }

    public static void main(String[] args) {
        Parent item = new Child();
        use(item);
    }


}
