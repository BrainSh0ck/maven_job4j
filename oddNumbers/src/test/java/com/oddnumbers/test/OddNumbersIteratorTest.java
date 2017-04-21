package com.oddnumbers.test;

import com.oddnumbers.OddNumbersIterator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * OddNumbersIterator test class.
 *
 * @author Vihovsky Roman
 * @since 18.04.2017
 */
public class OddNumbersIteratorTest {
    /**
     * next method test class.
     */
    @Test
    public void checkIndexMoveAcrossArray() {
        /**
         * first type of input array
         */
        OddNumbersIterator it = new OddNumbersIterator(new int[]{3, 1, 5, 3, 5, 7, 6, 9, 6, 4, 22});
        int result = (Integer) it.next();
        assertThat(result, is(3));
        result = (Integer) it.next();
        assertThat(result, is(1));
        result = (Integer) it.next();
        assertThat(result, is(5));
        result = (Integer) it.next();
        assertThat(result, is(3));
        result = (Integer) it.next();
        assertThat(result, is(5));
        result = (Integer) it.next();
        assertThat(result, is(7));
        result = (Integer) it.next();
        assertThat(result, is(9));
        /**
         * second type of input array
         */
        OddNumbersIterator it1 = new OddNumbersIterator(new int[]{4, 3, 2, 1, 2, 5, 7, 9, 15, 19, 21});
        result = (Integer) it1.next();
        assertThat(result, is(3));
        result = (Integer) it1.next();
        assertThat(result, is(1));
        result = (Integer) it1.next();
        assertThat(result, is(5));
        result = (Integer) it1.next();
        assertThat(result, is(7));
        result = (Integer) it1.next();
        assertThat(result, is(9));
        result = (Integer) it1.next();
        assertThat(result, is(15));
        result = (Integer) it1.next();
        assertThat(result, is(19));
        result = (Integer) it1.next();
        assertThat(result, is(21));
    }
    /**
     * hasNext() method test class.
     */
    @Test
    public void checkMethodHasNextWork() {
        /**
         * first type of input array
         */
        OddNumbersIterator it = new OddNumbersIterator(new int[]{2, 3, 4});
        assertThat(it.hasNext(), is(true));
        /**
         * second type of input array
         */
        OddNumbersIterator it1 = new OddNumbersIterator(new int[]{2, 3, 4, 5, 6});
        it1.next();
        assertThat(it1.hasNext(), is(true));
        it1.next();
        assertThat(it1.hasNext(), is(false));
    }
}