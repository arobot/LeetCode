# 反转链表
给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。

## 分析

直接干吧

### 1. 常规翻转

```java
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
```

常规翻转时，借助一个变量 `pre` 存储遍历过的结点，以便于最后作为新的头返回。在循环中，使用一个临时变量 `next` 暂存下一个结点的信息，以便于翻转两个结点的关系。

### 2. 递归

```Java
    public static ListNode reverseList2(ListNode head) {
        // 终止条件
        if (head == null || head.next == null)
            return head;

        // 不断往后走，并在当前方法栈内部暂存下一个结点
        ListNode next = head.next;
        //直到获取到尾结点，返回尾结点。这是题目要求，这里的尾结点就变成了返回的头
        ListNode reverse = reverseList2(next);
        //倒置关系 后继结点关联当前结点
        next.next = head;
        //当前结点的后继设置为null
        head.next = null;
        return reverse;
    }
```