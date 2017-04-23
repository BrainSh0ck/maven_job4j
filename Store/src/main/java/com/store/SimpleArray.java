package com.store;

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
    public void delete(final int index) {
        T[] clone = (T[]) new Object[this.objects.length];
        for (int i = 0; i < this.objects.length; i++) {
            if ((i >= index) & (i != objects.length - 1)) {
                clone[i] = this.objects[i + 1];
            } else {
                clone[i] = this.objects[i];
            }
        }
        this.objects = clone;
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
}
