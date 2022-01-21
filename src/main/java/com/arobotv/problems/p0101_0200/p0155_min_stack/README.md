# 最小栈

设计一个支持 `push`, `pop` ,`top` 操作，并能在常数时间内检索到最小元素的栈。

- `push(x)` —— 将元素 x 推入栈中。
- `pop()` —— 删除栈顶的元素。
- `top()` —— 获取栈顶元素。
- `getMin()` —— 检索栈中的最小元素。

## 分析

首先需要明确这个栈的底层数据存储支持，是选择数组还是现有的容器类。因为要求是需要在常数时间内，也就是$O(1)$时间内查找到最小元素，可以考虑暂存最小值，在出入栈操作时进行最小元素判定与更换。

### 1. 链表法

在进行`pop`操作的时候，会有一个较高的最小值判定消耗。

```java
public class MinStack {
    int min = Integer.MAX_VALUE;
    LinkedList<Integer> linkedList = new LinkedList<>();

    public MinStack() {

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
```

> 执行用时：5 ms, 在所有 Java 提交中击败了63.03%的用户
>
> 内存消耗：40.3 MB, 在所有 Java 提交中击败了22.32%的用户

### 2. 辅助链表结点

给定一个链表结构:

```java
class Node {
        int val;
        int min;
        Node next;
}
```

每次入栈时，增加一个结点作为头结点。并且比较当前值和上一个结点最小值并存储。因为栈的结构是后入先出，所以每一个结点上都存储当前结点往下的最小值即可。

```java
//接口主要是方便测试使用
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
```

> 执行用时：4 ms, 在所有 Java 提交中击败了99.08%的用户
>
> 内存消耗：39.9 MB, 在所有 Java 提交中击败了81.24%的用户
