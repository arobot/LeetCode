package utils.node;

public class ListNode {
   public int val;
   public ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public static ListNode createList(int len) {
        ListNode head = new ListNode(1);
        ListNode currentNode = head;
        for (int i = 2; i <= len; i++) {
            ListNode node = new ListNode(i);
            currentNode.next = node;
            currentNode = node;
        }
        return head;
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
