package com.evennumbers.test;

import com.evennumbers.EvenNumbersIterator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * EvenNumbers test class.
 *
 * @author Vihovsky Roman
 * @since 17.04.2017
 */
public class EvenNumbersIteratorTest {
    /**
     * next method test class.
     */
    @Test
    public void checkIndexMoveAcrossArray() {
        /**
         * first type of input array
         */
        EvenNumbersIterator it = new EvenNumbersIterator(new int[]{1, 20, 1, 50, 1, 80, 1, 50, 4, 3});
        int result = (Integer) it.next();
        assertThat(result, is(20));
        result = (Integer) it.next();
        assertThat(result, is(50));
        result = (Integer) it.next();
        assertThat(result, is(80));
        result = (Integer) it.next();
        assertThat(result, is(50));
        result = (Integer) it.next();
        assertThat(result, is(4));
        /**
         * second type of input array
         */
        EvenNumbersIterator it1 = new EvenNumbersIterator(new int[]{2, 20, 1, 50, 4, 80, 8, 50, 12, 14});
        result = (Integer) it1.next();
        assertThat(result, is(2));
        result = (Integer) it1.next();
        assertThat(result, is(20));
        result = (Integer) it1.next();
        assertThat(result, is(50));
        result = (Integer) it1.next();
        assertThat(result, is(4));
        result = (Integer) it1.next();
        assertThat(result, is(80));
        result = (Integer) it1.next();
        assertThat(result, is(8));
        result = (Integer) it1.next();
        assertThat(result, is(50));
        result = (Integer) it1.next();
        assertThat(result, is(12));
        result = (Integer) it1.next();
        assertThat(result, is(14));
    }

    /**
     * hasNext() method test class.
     */
    @Test
    public void checkMethodHasNextWork() {
        /**
         * first type of input array
         */
        EvenNumbersIterator it = new EvenNumbersIterator(new int[]{1, 2, 3});
        assertThat(it.hasNext(), is(true));
        /**
         * second type of input array
         */
        EvenNumbersIterator it1 = new EvenNumbersIterator(new int[]{1, 2, 3, 4, 5});
        it1.next();
        assertThat(it1.hasNext(), is(true));
        it1.next();
        assertThat(it1.hasNext(), is(false));
    }
}