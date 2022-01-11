package problems.p0201_0300.p0234_palindrome_linked_list;

import utils.node.ListNode;

public class PalindromeLinkedList {

    // 快慢指针
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        // 快慢指针找出中点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 当fast不为null，说明有奇数个，且slow为中点
        if (fast != null)
            slow = slow.next;

        slow = reverseList(slow);
        while (slow != null) {
            if (head.val != slow.val)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    // 常规做法
    public static boolean isPalindrome2(ListNode head) {
        ListNode reverse = null;
        ListNode tmp = head;
        while (tmp != null) {
            reverse = new ListNode(tmp.val, reverse);
            tmp = tmp.next;
        }
        while (head != null) {
            if (reverse.val != head.val)
                return false;
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    // 递归做法
    public static Pair re(ListNode head, ListNode reverse) {
        if (head.next == null)
            return new Pair(reverse.next, head.val == reverse.val);
        Pair p = re(head.next, reverse);
        if (p.b) {
            p.b = head.val == p.node.val;
            p.node = p.node.next;
        }
        return p;
    }

    static class Pair {
        ListNode node;
        Boolean b;

        public Pair(ListNode node, Boolean b) {
            this.node = node;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Pair [b=" + b + ", node=" + node + "]";
        }

    }

    public static void main(String[] args) {
        ListNode head = ListNode.createList(3);
        // head.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}
