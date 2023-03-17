package com.arobotv.problems.p0201_0300.p0203_remove_linked_list_elements;

import com.arobotv.utils.node.ListNode;

public class RemoveLinkedListElements {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了60.89%的用户
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode preHead = new ListNode(0, head);
        ListNode next = head;
        head = preHead;
        while (next != null) {
            if (next.val == val) {
                head.next = next.next;
            } else {
                head = next;
            }
            next = head.next;
        }
        return preHead.next;
    }
}
