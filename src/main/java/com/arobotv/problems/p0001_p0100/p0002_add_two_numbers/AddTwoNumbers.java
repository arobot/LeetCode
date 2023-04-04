package com.arobotv.problems.p0001_p0100.p0002_add_two_numbers;

import com.arobotv.utils.node.ListNode;

public class AddTwoNumbers {
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

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
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
}
