package com.store;

/**
 * Store super class.
 *
 * @param <T> type of generic container
 * @author Vihovsky Roman
 * @since 24.04.2017
 */
public abstract class MainStore<T extends Base> implements Store<T> {
    /**
     * Data container.
     */
    private SimpleArray<T> data;
    /**
     * over checked index position.
     */
    private int index;

    /**
     * Default constructor.
     *
     * @param size size of initilized container
     */
    public MainStore(final int size) {
        this.data = new SimpleArray<T>(size);
    }

    /**
     * Get element to container.
     *
     * @param id id of got element
     * @return T element of container
     */
    @Override
    public T get(String id) {
        return findData(id);
    }

    /**
     * Add new element to container.
     *
     * @param object T object to add
     * @return true if NO exceptions
     */
    @Override
    public boolean add(T object) {
        this.data.add(object);
        return true;
    }

    /**
     * Delete T object by index.
     *
     * @param index position index
     */
    @Override
    public void delete(String id) {
        data.delete(index);
    }

    /**
     * Updete object in the container.
     *
     * @param object new T object
     * @param index  index of position to update
     * @throws NullPointerException if class or field not init
     */
    @Override
    public void update(T object, String id) throws NullPointerException {
        T obj = get(id);
        if ((object != null) & (obj.getid().equals(object.getid()))) {
            data.update(object, index);
        }
    }

    /**
     * Find data for delete.
     *
     * @param id id of object
     * @return index of find object
     * @throws NullPointerException if class or field not init
     */
    private T findData(String id) throws NullPointerException {
        T obj = null;
        for (int i = 0; i < data.getSize(); i++) {
            if (data.get(i) != null) {
                T value = data.get(i);
                if ((value != null) & (id.equals(value.getid()))) {
                    obj = value;
                    this.index = i;
                    break;
                }
            }
        }
        return obj;
    }
}