package com.arobotv.problems.p0101_0200.p0160_intersection_of_two_linked_lists;

import java.util.HashSet;
import java.util.Set;

import com.arobotv.utils.node.ListNode;

public class IntersectionOfTwoLinkedList {
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
}
