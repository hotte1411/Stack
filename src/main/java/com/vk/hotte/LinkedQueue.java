package com.vk.hotte;


import java.util.*;

/**
 * TODO: Add documentation
 * @param <E>
 */
public class LinkedQueue<E> implements Queue<E>{

    //TODO: убрать дублирование кода
    private final List<E> queue = new LinkedList<>();

    //TODO: добавить аннотацию Override во все переопределяемые методы в этом классе
    public int size() {
        //TODO: тесты
        return queue.size();
    }

    public void push(E e) {
        //TODO: убрать дублирование кода
        //TODO: тесты
        queue.add(e);
    }

    public E pull() {
        //TODO: тесты
        return queue.remove(0);
    }

    public boolean isEmpty() {
        //TODO: тесты
        //TODO: дублирование кода
        return size() == 0;
    }

    public boolean add(E e) {
        //TODO: тесты
        //TODO: дублирование кода
        push(e);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return queue.addAll(c);
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
