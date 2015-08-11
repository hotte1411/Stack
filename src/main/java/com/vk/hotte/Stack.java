package com.vk.hotte;


import java.util.LinkedList;
import java.util.List;

public class Stack<E> {

    private List<E> stack = new LinkedList<E>();

    public int size() {
        if(stack.size() > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return stack.size();
    }

    public void pull(E e) {
        stack.add(e);
    }

    public E push() {
        if (size() > 0) {
            E e = stack.get(size() - 1);
            stack.remove(size() - 1);
            return e;
        } else {
            return null;
        }

    }
}
