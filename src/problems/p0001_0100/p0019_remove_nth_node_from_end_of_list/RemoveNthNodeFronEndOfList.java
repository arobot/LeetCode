package problems.p0001_0100.p0019_remove_nth_node_from_end_of_list;

public class RemoveNthNodeFronEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode preHead = new ListNode(-1, head);
        ListNode c = preHead;
        while (c.next != null) {
            c = c.next;
            count++;
        }
        int index = count - n;
        c = preHead;
        while (index > 0) {
            c = c.next;
            index--;
        }
        if (c.next.next == null)
            c.next = null;
        else
            deleteNode(c.next);
        return preHead.next;
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode preHead = new ListNode(-1, head);
        ListNode fast = preHead;
        ListNode slow = preHead;
        while (n > 0 && fast.next != null) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next.next == null)
            slow.next = null;
        else
            deleteNode(slow.next);
        return preHead.next;

    }

    // recursive
    public static ListNode removeNthFromEnd3(ListNode head, int n) {
        int pos = length(head, n);
        // 说明删除的是头节点
        if (pos == n)
            return head.next;
        return head;
    }

    // 获取节点所在位置，逆序
    public static int length(ListNode node, int n) {
        if (node == null)
            return 0;
        int pos = length(node.next, n) + 1;
        // 获取要删除链表的前一个结点，就可以完成链表的删除
        if (pos == n + 1)
            node.next = node.next.next;
        return pos;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode currentNode = head;
        for (int i = 2; i < 3; i++) {
            ListNode node = new ListNode(i);
            currentNode.next = node;
            currentNode = node;
        }
        ListNode.print(head);

        ListNode.print(removeNthFromEnd3(head, 1));

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public static void print(ListNode head) {
        StringBuilder sb = new StringBuilder();
        String arrow = " → ";
        sb.append("Start|").append(arrow);
        while (head != null) {
            sb.append(head.val);
            sb.append(arrow);
            head = head.next;
        }
        System.out.println(sb.substring(0, sb.lastIndexOf(arrow)));
    }
}