package com.tworange;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Two range int array.
 *
 * @author Vihovsky Roman
 * @since 18.04.2017
 */
public class TwoRangeIterator implements Iterator {
    /**
     * input array.
     */
    private final int[][] value;
    /**
     * array index.
     */
    private int index;
    /**
     * Cross index.
     */
    private int cross;
    /**
     *  whole size of structure.
     */
    private int g;
        /**
     * Default constructor.
     *
     * @param value init array
     */
    public TwoRangeIterator(final int[][] value) {
        this.value = value;
        g = value[0].length + value[valLength()].length - 1;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        boolean result = false;
        if (this.index <= g) {
            result = true;
        }
        return result;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Object next() throws NoSuchElementException {
        int result;
        hasNext();
        if (this.index > g) {
            throw new NoSuchElementException();
        }
        if (this.index <= value[0].length - 1) {
           result = iterVal(0, this.index);
           cross++;
        } else {
           result = iterVal(1, this.index - cross);
        }
        this.index++;
        return result;
    }

    /**
     *  Length of data adapt.
     * @return adapt length
     */
    private int valLength() {
        return this.value.length - 1;
    }
    /**
     *  Method which return value by index.
     *
     *  @param array number of array
     *  @param element index of returned elements
     *  @return value of index
     */
    private int iterVal(int array, int element) {
        int set;
        set = value[array][element];
        return set;
    }
}
