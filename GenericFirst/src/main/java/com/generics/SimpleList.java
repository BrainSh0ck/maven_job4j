package com.generics;

/**
 * Generic demonstration.
 *
 * @author Vihovsky Roman
 * @since 21.04.2017
 *
 * @param <E> type of the conteiner
 */
public class SimpleList<E> {
    /**
     * input objects array.
     */
    private Object[] objects;
    /**
     * count index.
     */
    private int index = 0;
    /**
     *  Generic object print.
     * @param value input object
     * @param <K> type of object
     * @return return created object after print
     */
    public <K> K print(K value) {
        System.out.println(value.getClass());
        System.out.println(value);
        return value;
    }
    /**
     *  Default constructor.
     *
     * @param size size of container
     */
    public SimpleList(int size) {
        this.objects = new Object[size];
    }

    /**
     * Add object.
     * @param object object to add
     */
    public void add(E object) {
        this.objects[index++] = object;
    }

    /**
     *  Get from container.
     * @param position object position
     * @return container of the generic data
     */
    public E get(int position) {
        return (E) this.objects[position];
    }
}
