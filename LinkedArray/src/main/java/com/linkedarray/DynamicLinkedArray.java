package com.linkedarray;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Dymanic LinkedArray custom implementation.
 *
 * @param <E> type of data
 * @author Vihovsky Roman
 * @since 29.04.2017
 */
public class DynamicLinkedArray<E> implements ListContainerArray<E> {
    /**
     * Abstract size of container.
     */
    private int size;
    /**
     * Pointer to first node.
     * Invariant: (first == null && last == null) ||
     * (first.prev == null && first.item != null)
     */
    private Node<E> first;
    /**
     * Pointer to last node.
     * Invariant: (first == null && last == null) ||
     * (last.next == null && last.item != null)
     */
    private Node<E> last;
    /**
     * Constructs an empty list.
     */
    public DynamicLinkedArray() {
    }
    /**
     * Add new element to container.
     *
     * @param e type of element
     */
    @Override
    public void add(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<E>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        this.size++;
    }
    /**
     * Get element by index.
     *
     * @param index index of container element
     * @return object by index
     */
    @Override
    public E get(int index) {
        checkIndexPosition(index);
        return getNode(index).current;
    }
    /**
     * Node finder by index method.
     *
     * @param index looking index
     * @return the (non-null) Node at the specified element index.
     */
    Node<E> getNode(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return null;
    }
    /**
     * Main linked logic element Node - it's class which contain linked information in container  prev, next, current(item).
     *
     * @param <E> type of Node
     */
    private static class Node<E> {
        /**
         * Current element.
         */
        private E current;
        /**
         * Next element.
         */
        private Node<E> next;
        /**
         * Previous element.
         */
        private Node<E> prev;
        /**
         * Main Node element constructor.
         * @param prev previous element
         * @param element main element
         * @param next next element
         */
        Node(Node<E> prev, E element, Node<E> next) {
            this.current = element;
            this.next = next;
            this.prev = prev;
        }
    }
    /**
     * Validate index range.
     *
     * @param index requested index of Node
     * @throws NoSuchElementException if index isn't in containder range
     */
    private void checkIndexPosition(int index) throws NoSuchElementException {
        if (index < 0 && index > size - 1) {
            throw new NoSuchElementException();
        }
    }
}
