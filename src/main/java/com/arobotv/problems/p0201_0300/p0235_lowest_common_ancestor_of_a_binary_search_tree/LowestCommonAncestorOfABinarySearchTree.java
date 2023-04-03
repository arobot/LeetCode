package com.arobotv.problems.p0201_0300.p0235_lowest_common_ancestor_of_a_binary_search_tree;

import com.arobotv.utils.node.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    /*
     * 执行用时：5 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了58.72%的用户
     */

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*
         * 退出条件：
         * 1. 自己成为了公共祖先时
         * 2. pq位于node的两侧时
         */
        if (p.val > q.val) {
            TreeNode node = q;
            q = p;
            p = node;
        }
        if (p.val == q.val)
            return null;
        if (root.val == p.val || root.val == q.val)
            return root;
        if (p.val < root.val && root.val < q.val)
            return root;
        if (q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val)
            return lowestCommonAncestor(root.right, p, q);
        return null;
    }
}
