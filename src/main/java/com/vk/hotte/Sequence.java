package com.vk.hotte;


import java.util.Collection;

/**
 * TODO: Add documentation
 * @param <E>
 */
interface Sequence<E> extends Collection<E>{

    /**
     * TODO: Add documentation
     * @param e
     */
    void push(E e);

    /**
     * TODO: Add documentation
     * @return
     */
    E pull();

    /**
     * TODO: Add documentation
     * @return
     */
    int size();
}
