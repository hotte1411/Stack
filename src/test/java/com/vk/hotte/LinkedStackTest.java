package com.vk.hotte;

import org.junit.Assert;
import org.junit.Test;

public class LinkedStackTest {

    @Test
    public void testIfStackIsEmpty() {
        LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
        Assert.assertNull(linkedStack.pull());
    }

    @Test
    public void testPushElement() {
        LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
        linkedStack.push(6);
        int expected = 1;
        int actual = linkedStack.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPullElement() {
        LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
        linkedStack.push(6);
        int expected = 6;
        int actual = linkedStack.pull();
        Assert.assertEquals(expected, actual);
    }
}
