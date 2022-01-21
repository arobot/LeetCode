package com.arobotv.problems.p0101_0200.p0155_min_stack;

public class MinStackNode implements MinStack {

    private Node node;

    public MinStackNode() {

    }

    public void push(int val) {
        node = NodeHelper.add(val, node);
    }

    public void pop() {
        node = node.next;
    }

    public int top() {
        return node.val;
    }

    public int getMin() {
        return node.min;
    }

    static class Node {
        int val;
        int min;
        Node next;

        public Node(int val) {
            this.val = val;
            this.min = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
            if (next != null)
                this.min = Math.min(next.min, val);
        }
    }

    static class NodeHelper {
        public static Node add(int val, Node cur) {
            if (cur == null) {
                return new Node(val);
            } else {
                Node node = new Node(val);
                node.setNext(cur);
                return node;
            }
        }
    }
}
