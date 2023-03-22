package com.arobotv.problems.p0201_0300.p0226_invert_binary_tree;

import com.arobotv.utils.node.TreeNode;

public class InvertBinaryTree {
    /**
     * 层序遍历二叉树，并交换二叉树的左右子树
     * 
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了89.42%的用户
     */
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
