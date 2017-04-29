package com.listarray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Dynamic list array class.
 *
 * @param <E> type of ListArray implementation
 * @author Vihovsky Roman
 * @since 28.04.2017
 */
public class DynamicListArray<E> implements ListContainerArray<E> {
    /**
     * Size constant.
     */
    private final int defSIZE = 2;
    /**
     * Array of E type.
     */
    private E[] objects;
    /**
     * Container iterator body.
     */
    private Iterator<E> itr;
    /**
     * Size of ListArray.
     */
    private int size;
    /**
     * Default constructor.
     */
    @SuppressWarnings (value = "unchecked")
    public DynamicListArray() {
    this.itr = iterator();
    this.objects = (E[]) new Object[defSIZE];
    }
    /**
     * Add new element to container.
     *
     * @param e type of element
     */
    @Override
    public void add(E e) {
           reSize();
           this.objects[size++] = e;
    }

    /**
     * Resize inner array.
     * @throws OutOfMemoryError too large array
     */
    private void reSize() throws OutOfMemoryError {
        if (!itr.hasNext()) {
            this.size = objects.length;
            int newSize = size + (size >> 1);
            if (newSize > Integer.MAX_VALUE) {
                throw new OutOfMemoryError();
            }
            objects = Arrays.copyOf(objects, newSize);
        }
        this.itr.next();
    }
    /**
     * Get element by index.
     *
     * @param index index of container element
     * @return object by index
     */
    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) objects[index];
    }

    /**
     *  Index check method.
     * @param index requested index
     * @throws NoSuchElementException if index > size of array
     */
    private void checkIndex(int index) throws NoSuchElementException {
        if (index > this.size - 1) {
            throw new NoSuchElementException();
        }
    }
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return new IteratorEntity();
    }

    /**
     * Basic iterator implementation.
     *
     * @author Vihovsky Roman
     * @since 20.04.2017
     */
    private class IteratorEntity implements Iterator<E> {
        /**
         * current index of data array.
         */
        private int index;
        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return objects.length > this.index;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public E next() throws NoSuchElementException {
            return objects[index++];
        }
    }
}


