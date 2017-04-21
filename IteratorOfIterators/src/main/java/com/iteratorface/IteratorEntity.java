package com.iteratorface;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Basic iterator implementation.
 *
 * @author Vihovsky Roman
 * @since 20.04.2017
 * @param <B> type of data
 */
public class IteratorEntity<B> implements Iterator<B> {
    /**
     *  counter.
     */
    private static int count = 0;
    /**
     * array with import data.
     */
    private final B[] values;
    /**
     * current index of data array.
     */
    private int index;
    /**
     * Default constructor.
     * @param values input array init
     */
    public IteratorEntity(B... values) {
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
        return this.values.length > this.index;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public B next() throws NoSuchElementException {
        return values[index++];
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        for (B unit : values) {
            System.out.println(unit + " " + unit.getClass());
        }

        return String.format("%s - %s", this.getClass(), count++);
    }

}
