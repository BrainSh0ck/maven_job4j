package com.listarray;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * DynamicListArray test class.
 *
 * @author Vihovsky Roman
 * @since 29.04.2017
 */
public class DynamicListArrayTest {
    /**
     *  Add method test.
     * @throws Exception any exceptions
     */
    @Test
    public void add() throws Exception {
    ListContainerArray<Integer> list = new DynamicListArray<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        for (int i = 0; i < 1000000; i++) {
            assertThat(list.get(i), is(i));
        }
    }
    /**
     *  Get method test.
     * @throws Exception any exceptions
     */
    @Test
    public void get() throws Exception {
        ListContainerArray<String> list = new DynamicListArray<>();
        list.add("T");
        list.add("D");
        list.add("D");
        assertThat(list.get(0), is("T"));
        assertThat(list.get(1), is("D"));
        assertThat(list.get(2), is("D"));
    }
    /**
     *  Iterator body method test.
     * @throws Exception any exceptions
     */
    @Test
    public void iterator() throws Exception {
        ListContainerArray<String> list = new DynamicListArray<>();
        assertThat(list.iterator().hasNext(), is(true));
    }

}