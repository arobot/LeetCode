package com.arobotv.problems.p0201_0300.p0237_delete_node_in_a_linked_list;

public class DeleteLinkedListNode {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode currentNode = head;
        for (int i = 2; i < 8; i++) {
            ListNode node = new ListNode(i);
            currentNode.next = node;
            currentNode = node;
        }
        ListNode.print(head);
        deleteNode(head.next);
        ListNode.print(head);

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public boolean hasNext() {
        return next != null;
    }

    public static void print(ListNode head) {
        StringBuilder sb = new StringBuilder();
        String arrow = " → ";
        while (head.hasNext()) {
            sb.append(head.val);
            sb.append(arrow);
            head = head.next;
        }
        System.out.println(sb.substring(0, sb.lastIndexOf(arrow)));
    }
}