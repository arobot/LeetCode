package com.arobotv.problems.p0001_0100.p0083_remove_duplicates_from_sorted_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.node.ListNode;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    void testDeleteDuplicates() {
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
        ListNode head = ListNode.of(1);
        head.appendNode(1).appendNode(2);
        Assertions.assertEquals("[1, 2]", ListNode.quote(r.deleteDuplicates(head)));
    }

    @Test
    void testDeleteDuplicates2() {
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
        ListNode head = ListNode.of(1);
        head.appendNode(1).appendNode(2).appendNode(3).appendNode(3);
        Assertions.assertEquals("[1, 2, 3]", ListNode.quote(r.deleteDuplicates(head)));
    }

    @Test
    void testDeleteDuplicates3() {
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
        ListNode head = ListNode.of(1);
        head.appendNode(1);
        Assertions.assertEquals("[1]", ListNode.quote(r.deleteDuplicates(head)));
    }
}
