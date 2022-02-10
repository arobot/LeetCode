package com.arobotv.problems.p0101_0200.p0160_intersection_of_two_linked_lists;

import com.arobotv.utils.node.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoLinkedListTest {
    static IntersectionOfTwoLinkedList intersectionOfTwoLinkedList = new IntersectionOfTwoLinkedList();

    @Test
    void testGetIntersectionNode() {
        ListNode inter = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode a = new ListNode(9, new ListNode(10, inter));
        ListNode b = new ListNode(11, inter);
        ListNode intersectionNode = intersectionOfTwoLinkedList.getIntersectionNode(a, b);
        Assertions.assertEquals(inter.val, intersectionNode.val);
        intersectionNode = intersectionOfTwoLinkedList.getIntersectionNode2(a, b);
        Assertions.assertEquals(inter.val, intersectionNode.val);
    }

    @Test
    void testGetIntersectionNode2() {
        ListNode inter = null;
        ListNode a = new ListNode(9, new ListNode(10, inter));
        ListNode b = new ListNode(11, inter);
        ListNode intersectionNode = intersectionOfTwoLinkedList.getIntersectionNode(a, b);
        Assertions.assertEquals(null, intersectionNode);
        intersectionNode = intersectionOfTwoLinkedList.getIntersectionNode2(a, b);
        Assertions.assertEquals(null, intersectionNode);
    }
}
