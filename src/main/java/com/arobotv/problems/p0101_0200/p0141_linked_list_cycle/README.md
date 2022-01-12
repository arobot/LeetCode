# 环形链表

给你一个链表的头节点`head`，判断链表中是否有环。

如果链表中有某个节点，可以通过连续跟踪`next`指针再次到达，则链表中存在环。为了表示给定链表中的环，评测系统内部使用整数`pos`来表示链表尾连接到链表中的位置（索引从`0`开始）。如果`pos`是`-1`，则在该链表中没有环。注意：`pos`不作为参数进行传递，仅仅是为了标识链表的实际情况。

如果链表中存在环，则返回`true`。否则，返回`false`。

## 分析

代码层面如何标识是否是遇到了同一个对象呢？在Java这个层面，对象的Hash是一个简洁明了的判断方式。

### 1. Hash 判定

通过向HashMap中保存遍历到的次数，当出现遍历次数大于1次的节点，即可判定是环形链表。但是该方式必然导致${O(N)}$的空间复杂度。

> 执行用时：5 ms, 在所有 Java 提交中击败了11.65%的用户
>
> 内存消耗：38.5 MB, 在所有 Java 提交中击败了99.38%的用户

### 2. 快慢指针

> 如何使用${O(1)}$的空间复杂度解决该问题呢？

考虑取两个指针，一个为快指针 `fast` ,每次步进2个结点；另一个慢指针 `slow` ,每次步进1个结点。当遇到条件:

```java
fast = null || fast.next = null
```

表示肯定不是环形链表。如果一直遇不到这个条件，那么必然需要一个退出的判断，此时，还有一个慢指针，快指针 `fast` 在经历一次到多次循环后，必然会出现在 `slow` 的后面，或者是两者重合。

```Java
    public static boolean hasCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：39.3 MB, 在所有 Java 提交中击败了72.10%的用户

### 3. 逐个删除

作为记录。

遍历所有结点，并删除每个遇到的结点。如果没有环，所有的结点都会断开，并且不会再遇到之前断开的结点。如果有环，则必然会遇到一个断开的结点。此时，需要找到一个条件去判断是前驱结点，在断开的结点上，将 `next` 指向自己来表示是否断开。

有一个特殊情况，当最后一个结点本来就指向自己成环。在操作步骤上就需要考虑，先判断下一个结点是否指向自己，再进行断开操作即可。

```java
    public static boolean hasCycle3(ListNode head) {
        while (head != null && head.next != null) {
            ListNode next = head.next;
            if (next == next.next)
                return true;
            head.next = head;
            head = next;
        }
        return false;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了25.37%的用户
>
> 内存消耗：39.1 MB, 在所有 Java 提交中击败了85.79%的用户
