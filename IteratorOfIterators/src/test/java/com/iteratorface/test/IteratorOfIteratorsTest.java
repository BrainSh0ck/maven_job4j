package com.iteratorface.test;

import com.iteratorface.IteratorEntity;
import com.iteratorface.IteratorOfIterators;
import org.junit.Test;
import java.util.Iterator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Complex interfaces test class.
 *
 * @author Vihovsky Roman
 * @since 20.04.2017
 */
public class IteratorOfIteratorsTest {
    /**
     * Test method.
     * @throws Exception exeptions of test
     */
    @Test
    public void testIndexMoveAcrossComplexData() throws Exception {
        Iterator<Integer> data1 = new IteratorEntity<>(4, 2, 0, 4, 6, 4, 9);
        Iterator<Integer> data2 = new IteratorEntity<>(0, 9, 8, 7, 5);
        Iterator<Integer> data3 = new IteratorEntity<>(1, 3, 5, 6, 7, 0, 9, 8, 4);
        Iterator<Iterator<Integer>> complexData = new IteratorEntity<>(data1, data2, data3);
        IteratorOfIterators it = new IteratorOfIterators();
        Iterator fIterator = it.convert(complexData);
        assertThat(fIterator.next(), is(4));
        assertThat(fIterator.next(), is(2));
        assertThat(fIterator.next(), is(0));
        assertThat(fIterator.next(), is(4));
        assertThat(fIterator.next(), is(6));
        assertThat(fIterator.next(), is(4));
        assertThat(fIterator.next(), is(9));
        assertThat(fIterator.next(), is(0));
        assertThat(fIterator.next(), is(9));
        assertThat(fIterator.hasNext(), is(true));
        assertThat(fIterator.next(), is(8));
        assertThat(fIterator.next(), is(7));
        assertThat(fIterator.next(), is(5));
        assertThat(fIterator.next(), is(1));
        assertThat(fIterator.next(), is(3));
        assertThat(fIterator.next(), is(5));
        assertThat(fIterator.next(), is(6));
        assertThat(fIterator.next(), is(7));
        assertThat(fIterator.next(), is(0));
        assertThat(fIterator.next(), is(9));
        assertThat(fIterator.next(), is(8));
        assertThat(fIterator.next(), is(4));
        assertThat(fIterator.hasNext(), is(false));
    }

}