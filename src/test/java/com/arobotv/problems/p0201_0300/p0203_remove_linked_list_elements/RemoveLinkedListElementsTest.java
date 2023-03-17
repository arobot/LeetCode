package com.arobotv.problems.p0201_0300.p0203_remove_linked_list_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.node.ListNode;

public class RemoveLinkedListElementsTest {
    @Test
    void testRemoveElements() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();
        ListNode head = ListNode.of(1);
        head.appendNode(2).appendNode(6).appendNode(3).appendNode(4).appendNode(5).appendNode(6);
        ListNode.printQuote(head);
        head = remove.removeElements(head, 6);
        Assertions.assertEquals("[1, 2, 3, 4, 5]", ListNode.quote(head));
    }

    @Test
    void testRemoveElements2() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();
        ListNode head = null;
        ListNode.printQuote(head);
        head = remove.removeElements(head, 6);
        Assertions.assertEquals("[]", ListNode.quote(head));
    }

    @Test
    void testRemoveElements3() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();
        ListNode head = ListNode.of(7);
        head.appendNode(7).appendNode(7).appendNode(7).appendNode(7).appendNode(7).appendNode(7);
        ListNode.printQuote(head);
        head = remove.removeElements(head, 7);
        Assertions.assertEquals("[]", ListNode.quote(head));
    }
}
