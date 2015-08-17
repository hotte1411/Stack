package com.vk.hotte;


import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/**
 * TODO: Add documentation
 *
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {

    private final E[] array; //TODO: дублирование кода, вынести в общий класс
    private int countOfElements = 0;

    @SuppressWarnings("unchecked")
    public ArrayQueue(Class<E> elementType, int capacity) {
        // Массивы неизвестного типа нужно создавать только так, иначе ошибки полезут в работе
        //TODO: Вынести создание массива в общий класс для стека и очереди для избежания дублирования кода
        //TODO: тесты на создание пустой очереди
        this.array = (E[]) Array.newInstance(elementType, capacity);
    }

    @Override
    public void push(E e) {
        //TODO: добавить тесты для этого метода на три случая: когда массив пустой, когда он неполностью заполнен и когда он полностью заполнен. Проверить, что объект не остаётся в сломанном состоянии после этих трёх случаев.
        //TODO: дублирование кода -> вынести в общий класс для стека и очереди
        array[countOfElements++] = e;
    }

    @Override
    public E pull() {
        //TODO: проверить на три случая, как и с push: при пустом массиве, при неполностью заполненном и при полном. После вызова каждого из трёх случаев объект не должен оставаться в сломанном состоянии.
        //TODO: e - плохое название для переменной. Непонятно, что значит "e".
        E e = array[0];

        //TODO: вынеси это в отдельный метод с хорошим названием, чтобы сразу было понятно, что происходит тут
        for (int index = 1; index < countOfElements; ++index) {
            E tmp = array[index];
            array[index - 1] = array[index];
            array[index] = tmp;
        }

        return e;
    }

    @Override
    public int size() {
        //TODO: tests
        return countOfElements;
    }

    @Override
    public boolean isEmpty() {
        //TODO: tests
        //TODO: дублирование кода со стеком
        return countOfElements == 0;
    }

    @Override
    public boolean contains(Object o) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        //TODO: Implement this; tests
        throw new UnsupportedOperationException();
    }
}
