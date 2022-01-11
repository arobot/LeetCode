package problems.p0001_0100.p0021_merge_two_sorted_lists;

import utils.node.ListNode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = ListNode.createList(3);
        ListNode list2 = ListNode.createList(1);
        ListNode.print(mergeTwoLists(list1, list2));
    }
}
