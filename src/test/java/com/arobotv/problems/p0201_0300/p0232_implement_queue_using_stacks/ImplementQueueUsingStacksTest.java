package com.arobotv.problems.p0201_0300.p0232_implement_queue_using_stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplementQueueUsingStacksTest {

    @Test
    void testMyQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertFalse(myQueue.empty());
    }
}
