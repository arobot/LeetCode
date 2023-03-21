package com.arobotv.problems.p0201_0300.p0232_implement_queue_using_stacks;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static MyQueue geQueue() {
        return new MyQueue();
    }

}
/*
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.3 MB, 在所有 Java 提交中击败了54.15%的用户
 */

class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public MyQueue() {
        in.clear();
        out.clear();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.empty())
            while (!in.empty())
                out.push(in.pop());
        return out.pop();
    }

    public int peek() {
        if (out.empty())
            while (!in.empty())
                out.push(in.pop());
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }
}