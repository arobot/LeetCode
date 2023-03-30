package com.arobotv.problems.p0701_p0800.p0701_insert_into_a_binary_search_tree;

import com.arobotv.utils.node.TreeNode;

public class InsertIntoABinarySearchTree {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了41.00%的用户
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        if (root.val < val)
            root.right = insertIntoBST(root.right, val);
        return root;
    }
}
