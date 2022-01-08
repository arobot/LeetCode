# 回文链表

给你一个单链表的头节点 `head` ，请你判断该链表是否为回文链表。如果是，返回 `true` ；否则，返回 `false` 。

例如：`1->2->2->1` 就是回文链表，而 `1->2`则不是。

## 分析

要判定是否是回文，必然涉及到头和尾的对比。最为粗暴的方式可以遍历链表，并生成一条反向链表后，逐一比对。稍微优化一下代码，可以用递归的方式代替生成链表，因为递归可以在最底层开始反向遍历链表，并和传入的链表头进行比较。需要优化效率，则还需要精进，考虑快慢指针，找出中点后进行折半比较（学习而来，效率最优）

### 1. 暴力方式

略

### 2. 递归

```java
    // 递归做法
    public static Pair re(ListNode head, ListNode reverse) {
        if (head.next == null)
            return new Pair(reverse.next, head.val == reverse.val);
        Pair p = re(head.next, reverse);
        if (p.b) {
            p.b = head.val == p.node.val;
            p.node = p.node.next;
        }
        return p;
    }

    static class Pair {
        ListNode node;
        Boolean b;

        public Pair(ListNode node, Boolean b) {
            this.node = node;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Pair [b=" + b + ", node=" + node + "]";
        }

    }
```

递归这里借助了一个对象，不过其实有很多方式可以替代。

> 执行用时：19 ms, 在所有 Java 提交中击败了5.34%的用户
>
> 内存消耗：58.3 MB, 在所有 Java 提交中击败了5.00%的用户

### 3. 快慢指针

```java
// 快慢指针
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        // 快慢指针找出中点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 当fast不为null，说明有奇数个，且slow为中点
        if (fast != null)
            slow = slow.next;

        slow = reverseList(slow);
        while (slow != null) {
            if (head.val != slow.val)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
```

最开始思考时，就无法下手如何去一次遍历就能折半获取中点。这里分两步走和一步走的思路豁然开朗。赞

> 执行用时：4 ms, 在所有 Java 提交中击败了86.59%的用户
>
> 内存消耗：48.1 MB, 在所有 Java 提交中击败了92.33%的用户
