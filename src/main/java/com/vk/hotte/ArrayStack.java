package com.vk.hotte;


import java.util.Collection;
import java.util.Iterator;

public class ArrayStack<E> implements Stack<E>{

    private final E[] array;
    private int countOfElements = 0;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.array = (E[]) new Object[capacity];
    }

    @Override
    public void push(E e) {
        array[countOfElements++] = e;
    }

    @Override
    public E pull() {
        E e = array[countOfElements - 1];
        array[countOfElements--] = null;
        return e;
    }

    @Override
    public int size() {
        return countOfElements;
    }

    @Override
    public boolean isEmpty() {
        return countOfElements == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
}
