package com.linkedarray;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * DynamicLinkedArray test class.
 *
 * @author Vihovsky Roman
 * @since 29.04.2017
 */
public class DynamicLinkedArrayTest {
    /**
     *  Add method() test.
     * @throws Exception any exceptions
     */
    @Test
    public void add() throws Exception {
    ListContainerArray<Integer> list = new DynamicLinkedArray<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        for (int i = 0; i < 100; i++) {
            assertThat(list.get(i), is(i));
        }
    }
    /**
     *  Get method() test.
     * @throws Exception any exceptions
     */
    @Test
    public void get() throws Exception {
        ListContainerArray<String> list = new DynamicLinkedArray<>();
        list.add("T");
        list.add("D");
        list.add("D");
        assertThat(list.get(0), is("T"));
        assertThat(list.get(1), is("D"));
        assertThat(list.get(2), is("D"));
    }

}