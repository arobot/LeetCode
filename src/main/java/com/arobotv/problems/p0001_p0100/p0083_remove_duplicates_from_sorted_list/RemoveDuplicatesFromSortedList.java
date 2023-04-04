package com.arobotv.problems.p0001_p0100.p0083_remove_duplicates_from_sorted_list;

import com.arobotv.utils.node.ListNode;

public class RemoveDuplicatesFromSortedList {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了34.28%的用户
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(-200, head);
        ListNode curNode = preHead;
        while (curNode.hasNext()) {
            if (curNode.val == curNode.next.val) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return preHead.next;
    }
}
