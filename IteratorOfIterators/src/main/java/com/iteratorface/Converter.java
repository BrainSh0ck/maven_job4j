package com.iteratorface;

import java.util.Iterator;

/**
 * Interface Iterator<Iterator> which convert Iterator<Iterator<Integer>> interface.
 *
 * @author Vihovsky Roman
 * @since 20.04.2017
 */
interface Converter {
    /**
     *  Main method which convert Iterators<> to single Iterator.
     *
     * @param it link on the input Iterator of Iterators
     * @return link to the current inner Iterator
     */
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it);
}
