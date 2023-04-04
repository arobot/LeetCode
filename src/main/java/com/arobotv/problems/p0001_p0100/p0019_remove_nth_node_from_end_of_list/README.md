# 删除链表的倒数第N个结点

给你一个链表，删除链表的倒数第`n`个结点，并且返回链表的头结点。

## 分析

结点构型

```Java
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
```

因为是要倒数删除结点，但是入参是头结点，如何判断结点是倒数的第几个就是问题的关键。正常逻辑来说，通过一次遍历可以获取到链表的长度，然后第二次遍历就可以进行删除操作。

如何通过一次遍历就能够进行删除呢？简单的思路可以是空间换时间，将每个遍历的时候存放到数组中，直接通过下标进行操作。

### 1. 暴力遍历

如同分析时的设想，直接第一次遍历获取长度，第二次遍历找到需要删除结点的前一个结点。为了方便操作，会在前面补充一个结点。

```Java
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode preHead = new ListNode(-1, head);
        ListNode c = preHead;
        while (c.next != null) {
            c = c.next;
            count++;
        }
        int index = count - n;
        c = preHead;
        while (index > 0) {
            c = c.next;
            index--;
        }
        if (c.next.next == null)
            c.next = null;
        else
            deleteNode(c.next);
        return preHead.next;
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
```

>执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
>内存消耗：36.5 MB, 在所有 Java 提交中击败了35.30%的用户

### 2. 双指针（滑动窗口）

考虑做一个长度为n的滑动窗口，当串口的尾巴到达最后一个结点时，那窗口的头部，必然就是需要删除的结点。同理，我们也在最前面补一个结点 `-1` 以简化代码，这时候窗口会把需要删除的前一个结点也包含进来。

#### 当n>1

**假设 n = 3**
|  -1   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |  10   |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|   -   |   -   |   -   |   -   |   -   |   -   |   -   |   0   |   1   |   2   |   3   |

**假设 n = 10**
|  -1   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |  10   |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|   0   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |  10   |

#### 当 n = 1

**多个元素**

|  -1   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |  10   |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   0   |   1   |

**一个元素**

|  -1   |   1   |
| :---: | :---: |
|   0   |   1   |

```java
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode preHead = new ListNode(-1, head);
        ListNode fast = preHead;
        ListNode slow = preHead;

        while (n>0 && fast.next != null) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next.next == null)
            slow.next = null;
        else
            deleteNode(slow.next);
        return preHead.next;
    }
```

>执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
>内存消耗：36.3 MB, 在所有 Java 提交中击败了66.22%的用户

### 3. 递归思想

递归通过不断的往深入的分解，在回归的时候解决问题。思路是着实巧妙，故做记录

假定：链表为 `1→2→3→4→5`,需要删除倒数第`1`个元素，即结点`5`

| 操作  | 递归方向 | node  |  pos  | 递归方向 |                                       操作                                        |
| :---: | :------: | :---: | :---: | :------: | :-------------------------------------------------------------------------------: |
|   -   |    ↓     |   1   |   5   |    ↑     |                                         -                                         |
|   -   |    ↓     |   2   |   4   |    ↑     |                                         -                                         |
|   -   |    ↓     |   3   |   3   |    ↑     |                                         -                                         |
|   -   |    ↓     |   4   |   2   |    ↑     | pos==n+1 <br> node.next is 5 & node.next.next is null<br>node.next=node.next.next |
|   -   |    ↓     |   5   |   1   |    ↑     |                                      pos==n                                       |
|   -   |    ↓     | null  |   -   |    ↑     |                                         -                                         |

假定：链表为 `1→2→3→4→5`,需要删除倒数第`2`个元素，即结点`4`

| 操作  | 递归方向 | node  |  pos  | 递归方向 |                                      操作                                      |
| :---: | :------: | :---: | :---: | :------: | :----------------------------------------------------------------------------: |
|   -   |    ↓     |   1   |   5   |    ↑     |                                       -                                        |
|   -   |    ↓     |   2   |   4   |    ↑     |                                       -                                        |
|   -   |    ↓     |   3   |   3   |    ↑     | pos==n+1 <br> node.next is 4 & node.next.next is 5<br>node.next=node.next.next |
|   -   |    ↓     |   4   |   2   |    ↑     |                                     pos==n                                     |
|   -   |    ↓     |   5   |   1   |    ↑     |                                       -                                        |
|   -   |    ↓     | null  |   -   |    ↑     |                                       -                                        |

假定：链表为 `1→2→3→4→5`,需要删除倒数第`5`个元素，即结点`1`

| 操作  | 递归方向 | node  |  pos  | 递归方向 |  操作  |
| :---: | :------: | :---: | :---: | :------: | :----: |
|   -   |    ↓     |   1   |   5   |    ↑     | pos==n |
|   -   |    ↓     |   2   |   4   |    ↑     |   -    |
|   -   |    ↓     |   3   |   3   |    ↑     |   -    |
|   -   |    ↓     |   4   |   2   |    ↑     |        |
|   -   |    ↓     |   5   |   1   |    ↑     |   -    |
|   -   |    ↓     | null  |   -   |    ↑     |   -    |

此时的操作已经不在递归中完成，递归方法已全部从方法栈中弹出。此时，回到调用递归的方法中，判断 `pos==n` ,需要删除的是头结点，故需要返回 `head.next` 即可。

```java
    // recursive
    public static ListNode removeNthFromEnd3(ListNode head, int n) {
        int pos = length(head, n);
        // 说明删除的是头节点
        if (pos == n)
            return head.next;
        return head;
    }

    // 获取节点所在位置，逆序
    public static int length(ListNode node, int n) {
        if (node == null)
            return 0;
        int pos = length(node.next, n) + 1;
        // 获取要删除链表的前一个结点，就可以完成链表的删除
        if (pos == n + 1)
            node.next = node.next.next;
        return pos;
    }
```