package com.simplearray.test;

import com.simplearray.SimpleArray;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SimpleArray generic test class.
 *
 * @author Vihovsky Roman
 * @since 22.04.2017
 */
public class SimpleArrayTest {
    /**
     * Test method.
     */
    @Test
    public void tryToInit() {
        SimpleArray<Integer> list = new SimpleArray(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.update(6, 4);
        list.delete(1);
        assertThat(list.get(0), is(1));
        assertThat(list.get(1), is(3));
        assertThat(list.get(2), is(4));
        assertThat(list.get(3), is(6));
    }
}