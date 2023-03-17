package com.arobotv.utils.node;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
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
        return createList(1, len);
    }

    public static ListNode of(int val) {
        return new ListNode(val);
    }

    public ListNode appendNode(int val) {
        this.next = of(val);
        return this.next;
    }

    public static ListNode createList(int startNum, int len) {
        ListNode head = new ListNode(startNum);
        ListNode currentNode = head;
        for (int i = 2; i <= len; i++) {
            ListNode node = new ListNode(currentNode.val + 1);
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

    public static String quote(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        List<String> list = new ArrayList<>();
        while (head != null) {
            list.add(String.valueOf(head.val));
            head = head.next;
        }
        String join = list.stream().collect(Collectors.joining(", "));
        sb.append(join);
        sb.append("]");
        return sb.toString();
    }

    public static void printQuote(ListNode head) {
        System.out.println(quote(head));
    }
}
