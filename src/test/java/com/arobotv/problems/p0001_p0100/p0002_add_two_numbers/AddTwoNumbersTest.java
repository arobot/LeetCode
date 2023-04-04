package com.arobotv.problems.p0001_p0100.p0002_add_two_numbers;

import com.arobotv.utils.node.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    @Test
    void testAddTwoNumbers() {
        AddTwoNumbers twoNumbers = new AddTwoNumbers();
        ListNode one = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode two = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = twoNumbers.addTwoNumbers(one, two);
        Assertions.assertEquals("[7, 0, 8]", ListNode.quote(result));
        result = twoNumbers.addTwoNumbers2(one, two);
        Assertions.assertEquals("[7, 0, 8]", ListNode.quote(result));
    }

    @Test
    void testAddTwoNumbers2() {
        AddTwoNumbers twoNumbers = new AddTwoNumbers();
        ListNode one = new ListNode(0);
        ListNode two = new ListNode(0);
        ListNode result = twoNumbers.addTwoNumbers(one, two);
        Assertions.assertEquals("[0]", ListNode.quote(result));
        result = twoNumbers.addTwoNumbers2(one, two);
        Assertions.assertEquals("[0]", ListNode.quote(result));
    }

    @Test
    void testAddTwoNumbers3() {
        AddTwoNumbers twoNumbers = new AddTwoNumbers();
        ListNode one = new ListNode(9, new ListNode(9));
        ListNode two = new ListNode(9);
        ListNode result = twoNumbers.addTwoNumbers(one, two);
        Assertions.assertEquals("[8, 0, 1]", ListNode.quote(result));
        result = twoNumbers.addTwoNumbers2(one, two);
        Assertions.assertEquals("[8, 0, 1]", ListNode.quote(result));
    }

    @Test
    void testAddTwoNumbers4() {
        AddTwoNumbers twoNumbers = new AddTwoNumbers();
        ListNode one = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode two = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        ListNode result = twoNumbers.addTwoNumbers(one, two);
        Assertions.assertEquals("[7, 0, 4, 0, 1]", ListNode.quote(result));
        result = twoNumbers.addTwoNumbers2(one, two);
        Assertions.assertEquals("[7, 0, 4, 0, 1]", ListNode.quote(result));
    }

    @Test
    void testAddTwoNumbers5() {
        AddTwoNumbers twoNumbers = new AddTwoNumbers();
        ListNode one = new ListNode(1, new ListNode(8));
        ListNode two = new ListNode(0);
        ListNode result = twoNumbers.addTwoNumbers(one, two);
        Assertions.assertEquals("[1, 8]", ListNode.quote(result));
        result = twoNumbers.addTwoNumbers2(one, two);
        Assertions.assertEquals("[1, 8]", ListNode.quote(result));
    }
}
