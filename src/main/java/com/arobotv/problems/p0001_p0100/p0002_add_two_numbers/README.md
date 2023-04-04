# 两数相加

给你两个 **非空** 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 **一位** 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

## 分析

两数之和可能存在进位的关系。这里需要重点关注任意一个链表在结束遍历后，另一个链表元素的`val`值变化，可以做处理，也可以不处理直接遍历到最后。

### 1. 遍历求和

```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode head = null;
        ListNode temp = null;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            if (head == null) {
                head = new ListNode((a + b) % 10);
                temp = head;
                add = (a + b) / 10;
            } else {
                temp.next = new ListNode((a + b + add) % 10);
                add = (a + b + add) / 10;
                temp = temp.next;
            }
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        if (add == 1) {
            temp.next = new ListNode(1);
        }
        return head;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：41.4 MB, 在所有 Java 提交中击败了5.00%的用户

### 2. 优化为InPlace操作

上述方法需要新建一条链表，增加空间占用，现在考虑就地修改，尝试优化空间复杂度。

但是最终的效果仿佛变化不大。

```java
int add = 0;
        ListNode head1 = l1;
        ListNode head2 = l2;
        while (l1 != null && l2 != null) {
            l1.val = (l1.val + l2.val + add);
            add = l1.val / 10;
            l1.val %= 10;
            l2.val = l1.val;
            if (l1.next == null && l2.next == null) {
                if (add == 1)
                    l1.next = new ListNode(1);
                return head1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (add == 0)
            return l2 == null ? head1 : head2;

        while (l1 != null) {
            if (l1.val == 9) {
                l1.val = 0;
                add = 1;
                if(l1.next==null){
                    l1.next = new ListNode(1);
                    return head1;
                }
            } else {
                l1.val += 1;
                add = 0;
                return head1;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            if (l2.val == 9) {
                l2.val = 0;
                add = 1;
                if(l2.next==null){
                    l2.next = new ListNode(1);
                    return head2;
                }
            } else {
                l2.val += 1;
                add = 0;
                return head2;
            }
            l2 = l2.next;
        }
        return head1;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：41.2 MB, 在所有 Java 提交中击败了5.00%的用户
