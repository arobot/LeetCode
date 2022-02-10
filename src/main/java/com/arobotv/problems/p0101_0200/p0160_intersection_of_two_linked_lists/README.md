# 相交链表

[相交链表（LeetCode）](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/)

## 分析

相交的点在`java`里面有一个显而易见的特点，对象`Hash`值一定相同。所以目标就是找出第一个具有相同`Hash`值的结点。

### 1. 空间换时间方法

将每一个结点的Hash值存储下来，判断第一个重复的Hash值所在的结点。

```java
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<Integer> hashSet = new HashSet<>();
        while (headA != null) {
            hashSet.add(headA.hashCode());
            headA = headA.next;
        }
        while (headB != null) {
            if (hashSet.contains(headB.hashCode()))
                return headB;
            headB = headB.next;
        }
        return null;
    }
```

> 执行用时：8 ms, 在所有 Java 提交中击败了10.92%的用户
>
> 内存消耗：44.8 MB, 在所有 Java 提交中击败了5.03%的用户
