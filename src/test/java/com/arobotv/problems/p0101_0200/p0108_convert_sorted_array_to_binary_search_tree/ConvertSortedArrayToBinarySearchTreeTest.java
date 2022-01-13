package com.arobotv.problems.p0101_0200.p0108_convert_sorted_array_to_binary_search_tree;

import java.util.LinkedList;

import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {
    static ConvertSortedArrayToBinarySearchTree searchTree = new ConvertSortedArrayToBinarySearchTree();

    @Test
    void testOne() {
        int[] nums = { 1 };
        TreeNode root = searchTree.sortedArrayToBST(nums);
        Assertions.assertEquals("[1]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
        root = searchTree.sortedArrayToBST(nums, 0, nums.length - 1);
        Assertions.assertEquals("[1]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
    }

    @Test
    void testTwo() {
        int[] nums = { 1, 3 };
        TreeNode root = searchTree.sortedArrayToBST(nums);
        Assertions.assertEquals("[1, 3]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
        root = searchTree.sortedArrayToBST(nums, 0, nums.length - 1);
        Assertions.assertEquals("[1, 3]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
    }

    @Test
    void testThree() {
        int[] nums = { 1, 2, 3 };
        TreeNode root = searchTree.sortedArrayToBST(nums);
        Assertions.assertEquals("[1, 2, 3]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
        root = searchTree.sortedArrayToBST(nums, 0, nums.length - 1);
        Assertions.assertEquals("[1, 2, 3]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
    }

    @Test
    void testMore() {
        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode root = searchTree.sortedArrayToBST(nums);
        Assertions.assertEquals("[-10, -3, 0, 5, 9]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
        root = searchTree.sortedArrayToBST(nums, 0, nums.length - 1);
        Assertions.assertEquals("[-10, -3, 0, 5, 9]", TreeUtils.inOrderList(root, new LinkedList<>()).toString());
    }
}
