package com.vk.hotte;


import java.util.Collection;

public interface Sequence<E> extends Collection<E>{

    void push(E e);

    E pull();

    int size();
}