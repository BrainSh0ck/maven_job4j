package com.store;

/**
 * Store interface.
 *
 * @author Vihovsky Roman
 * @since 23.04.2017
 * @param <T> type of data
 */
public interface Store<T extends Base> {
    /**
     * Get element to container.
     * @param id id of got element
     * @return T element of container
     */
    T get(String id);

    /**
     * Add new element to container.
     * @param object T object to add
     * @return true if NO exceptions
     */
    boolean add(T object);
    /**
     * Delete T object by id.
     * @param id delete object by id
     */
    void delete(String id);

    /**
     * Updete object in the container.
     * @param object new T object
     * @param id of updated object
     */
    void update(T object, String id);
}
