package com.generics.test;

import com.generics.SimpleList;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Generic test class.
 *
 * @author Vihovsky Roman
 * @since 21.04.2017
 */
public class SimpleListTest {
    /**
     * O.
     */
    public class O { }
    /**
     * A.
     */
    public class A extends O { }
    /**
     * B ext A.
     */
    public class B extends A { }
    /**
     * C ext B.
     */
    public class C extends B {
        /**
         * method.
         */
        public void dd() {

        }
    }
    /**
     * String test method.
     * @throws Exception test exceptions
     */
    @Test
    public void addString() throws Exception {
    SimpleList<String> simple = new SimpleList(4);
    simple.add("test");
    String result = simple.get(0);
    assertThat(result, is("test"));
    //simple.print(true);
    }
    /**
     * Integer test method.
     * @throws Exception test exceptions
     */
    @Test
    public void addInteger() throws Exception {
        SimpleList<Integer> simple = new SimpleList(4);
        simple.add(1);
        Integer result = simple.get(0);
        assertThat(result, is(1));
    }
    /**
     *  Wildcard try.
     */
    @Test
    public void wildTest() {
    SimpleList<O> list = new SimpleList(10);
    list.add(new O());
    list.add(new A());
    list.add(new B());
    list.add(new C());
    printLower(list);
    System.out.println(list.get(0).getClass());
    System.out.println(list.get(3).getClass());
        ((C) list.get(3)).dd();
    }

    /**
     * Print method.
     * @param object object
     */
    public void printLower(SimpleList<? extends O> object) {

    }
}