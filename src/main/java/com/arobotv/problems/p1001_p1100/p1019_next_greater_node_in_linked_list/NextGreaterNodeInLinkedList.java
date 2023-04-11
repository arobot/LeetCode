package com.arobotv.problems.p1001_p1100.p1019_next_greater_node_in_linked_list;

import java.util.ArrayDeque;
import java.util.Deque;

import com.arobotv.utils.node.ListNode;

public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        // 生成Deque栈，栈中保存节点index和val，并首次遍历获取链表长度
        Deque<int[]> stack = new ArrayDeque<>();
        int len = 0;
        for (ListNode node = head; node != null; node = node.next) {
            len++;
        }
        // 构造一个返回数组
        int[] result = new int[len];
        // 通过生成单调链表，获取每个节点的nextLargerNode
        int index = 0;
        while (head != null) {
            while (!stack.isEmpty() && stack.peek()[1] < head.val) {
                int[] pop = stack.pop();
                result[pop[0]] = head.val;
            }
            stack.push(new int[] { index++, head.val });
            head = head.next;
        }
        return result;
    }
}
