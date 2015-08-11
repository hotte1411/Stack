package com.vk.hotte;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void testIfStackIsEmpty() {
        Stack<Integer> stack = new Stack<Integer>();
        Assert.assertNull(stack.push());
    }

    @Test
    public void testPullElement() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.pull(6);
        int expected = 1;
        int actual = stack.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPushElement() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.pull(6);
        int expected = 6;
        int actual = stack.push();
        Assert.assertEquals(expected, actual);
    }
}
