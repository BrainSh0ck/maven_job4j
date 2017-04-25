package com.store;

import java.util.NoSuchElementException;

/**
 * SimpleArray generic class.
 *
 * @param <T> type of container
 * @author Vihovsky Roman
 * @since 22.04.2017
 */
public class SimpleArray<T> {
    /**
     * Inner generic container.
     */
    private T[] objects;
    /**
     * Index of data.
     */
    private int index;

    /**
     * Default constructor.
     *
     * @param size size of constructor
     */
    @SuppressWarnings (value = "unchecked")
    public SimpleArray(final int size) {
        this.objects = (T[]) new Object[size];
    }

    /**
     * Add method.
     *
     * @param object added object
     */
    public void add(T object) {
        this.objects[index++] = object;
    }

    /**
     * Delete method.
     *
     * @param index object to delete
     */
    @SuppressWarnings (value = "unchecked")
    public void delete(int index) {
        validateIndex(index);
        for (int i = 0; i < this.objects.length; i++) {
            if ((i == index) & i < this.objects.length - 1) {
                this.objects[i] = this.objects[i + 1];
            }
            if ((i == index) & (i == this.objects.length - 1)) {
                this.objects[i] = null;
            }
            if ((i > index) & (i != this.objects.length - 1)) {
                this.objects[i] = this.objects[i + 1];
                this.objects[i + 1] = null;
            }
        }
    }
    /**
     * Update data method.
     * @param object new object
     * @param index index of old object;
     */
    public void update(T object, final int index) {
        this.objects[index] = object;
    }
    /**
     * Get by index method.
     *
     * @param index index of data
     * @return T object
     */
    public T get(final int index) {
        return (T) this.objects[index];
    }
    /**
     * Index position validate.
     * @param index checked index
     * @return true if operation is successful
     * @throws NoSuchElementException if index to low or too high
     */
    private boolean validateIndex(final int index) {
        if ((index < 0) & (index > this.objects.length)) {
            throw new NoSuchElementException();
        }
        return true;
    }
    /**
     *  Conteiner size getter.
     * @return size of T objects.
     */
    public int getSize() {
        return this.objects.length;
    }
}
