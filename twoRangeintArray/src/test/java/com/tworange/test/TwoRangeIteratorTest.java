package com.tworange.test;

import com.tworange.TwoRangeIterator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TwoRangeIterator test class.
 *
 * @author Vihovsky Roman
 * @since 19.04.2017
 */
public class TwoRangeIteratorTest {
    /**
     *  next() method test class.
     */
    @Test
    public void checkIndexMoveAcrossArray() {
        /**
         *  first type of array init.
         */
        TwoRangeIterator it = new TwoRangeIterator(new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8, 9}});
        int result = (Integer) it.next();
        assertThat(result, is(1));
        assertThat(it.hasNext(), is(true));
        it.next();
        result = (Integer) it.next();
        assertThat(result, is(3));
        assertThat(it.hasNext(), is(true));
        result = (Integer) it.next();
        assertThat(result, is(4));
        result = (Integer) it.next();
        assertThat(result, is(5));
        it.next();
        it.next();
        result = (Integer) it.next();
        assertThat(result, is(8));
        result = (Integer) it.next();
        assertThat(result, is(9));
        assertThat(it.hasNext(), is(false));
        /**
         *  second type of array init.
         */
        TwoRangeIterator it1 = new TwoRangeIterator(new int[][]{new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{2, 1}});
        result = (Integer) it1.next();
        assertThat(result, is(9));
        assertThat(it1.hasNext(), is(true));
        it1.next();
        result = (Integer) it1.next();
        assertThat(result, is(7));
        assertThat(it1.hasNext(), is(true));
        result = (Integer) it1.next();
        assertThat(result, is(6));
        result = (Integer) it1.next();
        assertThat(result, is(5));
        it1.next();
        it1.next();
        assertThat(it1.hasNext(), is(true));
        result = (Integer) it1.next();
        assertThat(result, is(2));
        result = (Integer) it1.next();
        assertThat(result, is(1));
        assertThat(it1.hasNext(), is(false));
    }
}