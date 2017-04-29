package com.listarray;

/**
 * ListArray actions interface.
 *
 * @param <E> type of list implementation
 * @author Vihovsky Roman
 * @since 29.04.2017
 */
public interface ListContainerArray<E> extends Iterable<E> {
    /**
     * Add new element to container.
     *
     * @param e type of element
     */
    void add(E e);
    /**
     * Get element by index.
     *
     * @param index index of container element
     * @return object by index
     */
    E get(int index);

}
