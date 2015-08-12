package com.vk.hotte;


import java.util.*;

public class LinkedStack<E> implements Stack<E>{

    private List<E> stack = new LinkedList<>();

    public int size() {
        return stack.size();
    }

    public void push(E e) {
        stack.add(e);
    }

    public E pull() {
            return stack.remove(size() - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add(E e) {
        push(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> c) {
        return stack.addAll(c);
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }
}
