package com.arobotv.problems.p0301_0400.p0328_odd_even_linked_list;

import com.arobotv.utils.node.ListNode;

public class OddEvenLinkedList {
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
}
