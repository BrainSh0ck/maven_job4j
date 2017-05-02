package com.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Child child = new Child();
        Parent pChild = child;
        child.test();
        pChild.test();
    }
}
