package com.arobotv.problems.p0301_0400.p0328_odd_even_linked_list;

import com.arobotv.utils.node.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenLinkedListTest {
    @Test
    void testOddEvenList() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        OddEvenLinkedList oddEvenLinkedList  = new OddEvenLinkedList();
        ListNode result = oddEvenLinkedList.oddEvenList(listNode);
        Assertions.assertEquals("[1, 3, 5, 2, 4]", ListNode.quote(result));
    }
    @Test
    void testOddEvenList2() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6))))));
        OddEvenLinkedList oddEvenLinkedList  = new OddEvenLinkedList();
        ListNode result = oddEvenLinkedList.oddEvenList(listNode);
        Assertions.assertEquals("[1, 3, 5, 2, 4, 6]", ListNode.quote(result));
    }

    @Test
    void testOddEvenList3() {
        ListNode listNode = new ListNode(1);
        OddEvenLinkedList oddEvenLinkedList  = new OddEvenLinkedList();
        ListNode result = oddEvenLinkedList.oddEvenList(listNode);
        Assertions.assertEquals("[1]", ListNode.quote(result));
    }

    @Test
    void testOddEvenList4() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        OddEvenLinkedList oddEvenLinkedList  = new OddEvenLinkedList();
        ListNode result = oddEvenLinkedList.oddEvenList(listNode);
        Assertions.assertEquals("[1, 3, 2]", ListNode.quote(result));
    }
}
