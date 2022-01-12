package com.arobotv.problems.p0101_0200.p0141_linked_list_cycle;

import java.util.HashMap;
import java.util.Map;

import com.arobotv.utils.node.ListNode;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        while (head != null) {
            if (map.containsKey(head))
                return true;
            map.put(head, 1);
            head = head.next;
        }
        return false;
    }

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

    public static void main(String[] args) {
        ListNode head = ListNode.createList(1);
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        System.out.println(hasCycle3(head));
    }
}
