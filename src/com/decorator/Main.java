package com.decorator;

/**
 * Created by root on 09.04.2017.
 */


class MainComponent implements InterfaceComponent {
    public MainComponent() {
    //System.out.println(this.getClass());
    }

    @Override
    public void doOperation(String ob) {
        System.out.println(ob);
        System.out.println("World!");
    }
}

abstract class Decorator implements InterfaceComponent {
    protected InterfaceComponent component;

    public Decorator (InterfaceComponent c) {
        component = c;
        //System.out.println("Super constructor");
        System.out.println(component.getClass());
    }

    @Override
    public void doOperation(String ob) {
        System.out.println(ob);
        //System.out.println(component.getClass()+ " ");
        component.doOperation(" Call from AbstractDecorator");
    }

    public void newOperation() {
        System.out.println("Do Nothing");
    }
}

class DecoratorSpace extends Decorator{

    public DecoratorSpace(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation(String ob) {
        System.out.println(ob);
        System.out.print(" ");
        //System.out.println(component.getClass());
        super.doOperation(" Call from DecoratorSpace ");
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}

class DecoratorComma extends Decorator {

    public DecoratorComma(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation(String ob) {
        System.out.println(ob);
        System.out.print(",");
        //System.out.println(component.getClass());
        super.doOperation(" Call from DecoratorComma ");
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}

class DecoratorHello extends Decorator {

    public DecoratorHello(InterfaceComponent c) {
        super(c);
        System.out.println(this.getClass());
    }

    @Override
    public void doOperation(String ob) {
        System.out.println(ob);
        System.out.print("Hello");
        //System.out.println(component.getClass());
        super.doOperation(" Call from DecoratorHello ");
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
    }
}

class Main {

    public static void main (String... s) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
       // System.out.println(c);
        c.doOperation(" Call from Main "); // Результат выполнения программы "Hello, World!"
       // System.out.println(Thread.getAllStackTraces());

        c.newOperation(); // New hello operation

    }
}