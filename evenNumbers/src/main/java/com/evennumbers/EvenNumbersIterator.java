package com.evennumbers;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * com.evennumbers.EvenNumbersIterator iterator class.
 *
 * @author Vihovsky Roman
 * @since 17.04.2017
 */
public class EvenNumbersIterator implements Iterator {
    /**
     * Input array declaration.
     */
    private final int[] values;
    /**
     * this.index of input array.
     */
    private int index;

    /**
     * Default constructor.
     *
     * @param values input array data init.
     */
    public EvenNumbersIterator(final int[] values) {
        this.values = values;
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
        int step = this.index;
        while (step < dataLength()) {
            if (values[step] % 2 == 0) {
                result = true;
                break;
            }
            if ((values[step + 1] % 2) == 0) {
                result = true;
                this.index = step + 1;
                break;
            }
            step++;
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
        if (this.index > dataLength()) {
            throw new NoSuchElementException();
        }
        int prevIndex = this.index;
        if (hasNext()) {
            prevIndex = this.index;
            this.index++;
        }
        /**
         *  If last element of array odd.
         */
        if ((this.index == dataLength() + 1) & ((values[this.index] % 2) != 0)) {
            this.index++;
        }
        /**
         * Print last even element (important).
         */
        if (this.index == dataLength() + 1) {
            if ((this.index == dataLength() + 1) & ((values[this.index] % 2) == 0)) {
                prevIndex = this.index;
                this.index++;
            }
        }
        return values[prevIndex];
    }

    /**
     * Chech and adapt size of input array.
     *
     * @return int adapt size
     */
    private int dataLength() {
        return this.values.length - 1;
    }
}

