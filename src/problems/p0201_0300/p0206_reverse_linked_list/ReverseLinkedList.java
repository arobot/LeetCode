package problems.p0201_0300.p0206_reverse_linked_list;

import utils.node.ListNode;

public class ReverseLinkedList {
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

    public static void main(String[] args) {
        ListNode head = ListNode.createList(2);
        ListNode.print(head);
        head = reverseList2(head);
        ListNode.print(head);
    }
}
