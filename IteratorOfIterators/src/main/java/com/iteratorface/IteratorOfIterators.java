package com.iteratorface;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Body of Iterators convertor implements.
 *
 * @author Vihovsky Roman
 * @since 20.04.2017
 */
public class IteratorOfIterators implements Converter, Iterator {
    /**
     * d.
     *
     * @return d
     */
    public Iterator<Iterator<Integer>> getEnter() {
        return enter;
    }

    /**
     * d.
     *
     * @param enter th
     */
    public void setEnter(Iterator<Iterator<Integer>> enter) {
        this.enter = enter;
    }

    /**
     * d.
     *
     * @return current
     */
    public Iterator<Integer> getCurrent() {
        return current;
    }

    /**
     * d.
     *
     * @param current er
     */
    public void setCurrent(Iterator<Integer> current) {
        this.current = current;
    }

    /**
     * Enter construction of Iterators.
     */
    private Iterator<Iterator<Integer>> enter;
    /**
     * Output object.
     */
    private Iterator<Integer> current;

    /**
     * Main method which convert Iterators<> to single Iterator.
     *
     * @param it link on the input Iterator of Iterators
     * @return link to the current inner Iterator
     */
    @Override
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.enter = it;
        // Вброс первого объекта реализующего итерацию в общий стек индекса.
        if (it != null) {
            this.current = enter.next();
        } else {
            throw new IllegalArgumentException();
        }
        return this;
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
        if (this.current.hasNext()) {
            result = true;
        } else {
            if (enter.hasNext()) {
                this.current = this.enter.next();
                result = true;
            }
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
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.current.next();
    }
    // public int actualLengh (IteratorEntity<B> cl) {
    //    return
    // }
}
