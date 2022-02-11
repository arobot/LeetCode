package com.arobotv.problems.p0101_0200.p0105_construct_binary_tree_from_preorder_and_inorder_traversal;

import java.util.Arrays;

import com.arobotv.utils.node.TreeNode;

public class RebuildBinaryTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0)
            return null;
        if (inorder.length == 1)
            return new TreeNode(inorder[0]);
        int pVal = preorder[0];
        TreeNode pNode = new TreeNode(pVal);
        int[] left = splitArray(inorder, pVal, true);
        pNode.left = buildTree(splitArray(preorder, pVal, false), left);
        pNode.right = buildTree(
                Arrays.copyOfRange(preorder, left.length + 1, preorder.length), splitArray(inorder, pVal, false));
        return pNode;
    }

    int[] splitArray(int[] nums, int split, boolean left) {
        int index = 0;
        for (int i : nums) {
            if (i == split)
                break;
            index++;
        }
        return left ? Arrays.copyOfRange(nums, 0, index) : Arrays.copyOfRange(nums, index + 1, nums.length);
    }
}
