package com.arobotv.problems.p0101_0200.p0155_min_stack;

import java.util.LinkedList;

public class MinStackImpl implements MinStack {
    int min = Integer.MAX_VALUE;
    LinkedList<Integer> linkedList = new LinkedList<>();

    public MinStackImpl() {

    }

    public void push(int val) {
        linkedList.add(val);
        min = Math.min(min, val);
    }

    public void pop() {
        int last = linkedList.removeLast();
        if (last == min) {
            min = Integer.MAX_VALUE;
            for (int i : linkedList) {
                min = Math.min(i, min);
            }
        }
    }

    public int top() {
        return linkedList.peekLast();
    }

    public int getMin() {
        return min;
    }
}
