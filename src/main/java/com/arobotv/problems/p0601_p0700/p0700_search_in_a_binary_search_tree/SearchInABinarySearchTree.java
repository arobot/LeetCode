package com.arobotv.problems.p0601_p0700.p0700_search_in_a_binary_search_tree;

import java.util.Deque;
import java.util.LinkedList;

import com.arobotv.utils.node.TreeNode;

public class SearchInABinarySearchTree {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了94.10%的用户
     * 
     * 之前考虑的时候，没有注意到二叉搜索树的性质。左子树根节点是小于根节点且右子树根节点大于根节点
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            int count = deque.size();
            while (count > 0) {
                TreeNode node = deque.poll();
                if (node.val == val)
                    return node;
                if (node.val > val && node.left != null)
                    deque.add(node.left);
                if (node.val < val && node.right != null)
                    deque.add(node.right);
                count--;
            }
        }
        return null;
    }

    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了60.76%的用户
     */

    public TreeNode searchBST2(TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val == val)
            return root;
        return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
    }
}
