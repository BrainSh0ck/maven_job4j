package com.reflection;

import javax.jws.WebMethod;
import java.io.Serializable;

/**
 * Created by root on 08.04.2017.
 */
public class Test implements Serializable, Cloneable {
private int field;
private String lol;
private boolean bool;

    public Test() {
    }
    public Test(Object field) {
    }
    public Test(int field, String lol, boolean bool) {
    this.field = field;
    }

    @Deprecated
    protected static void method (String[] params) {}

    public void foo() {
        System.out.println("FOO");
    }

    @Override
    public String toString() {
        return "Test + field: "+field;
    }
    @WebMethod
    public int setField (int field) {
        return field;
    }

}
