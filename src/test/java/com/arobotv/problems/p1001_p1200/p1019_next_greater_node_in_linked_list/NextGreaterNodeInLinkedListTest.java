package com.arobotv.problems.p1001_p1200.p1019_next_greater_node_in_linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.node.ListNode;

public class NextGreaterNodeInLinkedListTest {
    @Test
    void testNextLargerNodes() {
        // 通过ListNode构造链表
        ListNode head = new ListNode(2);
        head.appendNode(1).appendNode(5);
        NextGreaterNodeInLinkedList nextGreaterNodeInLinkedList = new NextGreaterNodeInLinkedList();
        // 使用Assertions框架验证逻辑并判定结果是否符合[5,5,0]
        Assertions.assertArrayEquals(new int[] { 5, 5, 0 }, nextGreaterNodeInLinkedList.nextLargerNodes(head));
    }

    //生成测试用例2，输入2，7，4，3，5，返回[7,0,5,5,0]并完成测试
    @Test
    void testNextLargerNodes2() {
        // 通过ListNode构造链表
        ListNode head = new ListNode(2);
        head.appendNode(7).appendNode(4).appendNode(3).appendNode(5);
        NextGreaterNodeInLinkedList nextGreaterNodeInLinkedList = new NextGreaterNodeInLinkedList();
        // 使用Assertions框架验证逻辑并判定结果是否符合[5,5,0]
        Assertions.assertArrayEquals(new int[] { 7, 0, 5, 5, 0 }, nextGreaterNodeInLinkedList.nextLargerNodes(head));
    }
}
