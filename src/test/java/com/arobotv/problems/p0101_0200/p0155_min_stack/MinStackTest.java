package com.arobotv.problems.p0101_0200.p0155_min_stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinStackTest {

    @Test
    void test() {
        MinStack minStack = new MinStackImpl();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
        minStack = new MinStackNode();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }

    @Test
    void test2() {
        MinStack minStack = new MinStackImpl();
        minStack.push(1);
        minStack.push(2);
        Assertions.assertEquals(2, minStack.top());
        Assertions.assertEquals(1, minStack.getMin());
        minStack.pop();
        Assertions.assertEquals(1, minStack.getMin());
        Assertions.assertEquals(1, minStack.top());
        
        minStack = new MinStackNode();
        minStack.push(1);
        minStack.push(2);
        Assertions.assertEquals(2, minStack.top());
        Assertions.assertEquals(1, minStack.getMin());
        minStack.pop();
        Assertions.assertEquals(1, minStack.getMin());
        Assertions.assertEquals(1, minStack.top());
    }
}
