package com.arobotv.problems.p0101_0200.p0108_convert_sorted_array_to_binary_search_tree;

import java.util.Arrays;

import com.arobotv.utils.node.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int length = nums.length;
        if (length == 1)
            return new TreeNode(nums[0]);
        int mid = length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid + 1, length);
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
