# 奇偶链表

给定单链表的头节点 `head` ，将所有索引为奇数的节点和索引为偶数的节点分别组合在一起，然后返回重新排序的列表。

第一个节点的索引被认为是 **奇数** ， 第二个节点的索引为 **偶数** ，以此类推。

请注意，偶数组和奇数组内部的相对顺序应该与输入时保持一致。

你必须在 `O(1)` 的额外空间复杂度和 `O(n)` 的时间复杂度下解决这个问题。

## 分析

链表的奇偶遍历过程。

### 1.双指针头尾

记录下来奇数位置链表的尾巴，和偶数链表的头尾。使用双指针依次往后遍历两个奇偶位置的结点，并把这两个结点分配到奇偶链表的尾部后，将奇数链表的尾和偶数链表的头重新连接。

```java
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode odd = evenHead.next;
        ListNode evenTail = evenHead;
        while (odd != null) {
            evenTail.next = odd.next;
            odd.next = evenHead;
            oddTail.next = odd;
            oddTail = odd;
            evenTail = evenTail.next;
            odd = evenTail == null ? null : evenTail.next;
        }
        return head;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：40.8 MB, 在所有 Java 提交中击败了5.50%的用户
