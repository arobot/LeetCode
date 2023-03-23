package com.arobotv.problems.p0101_0200.p0112_path_sum;

import java.util.Deque;
import java.util.LinkedList;

import com.arobotv.utils.node.TreeNode;

public class PathSum {

    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了83.74%的用户
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            int count = deque.size();
            while (count > 0) {
                TreeNode node = deque.poll();
                if (node.left == null && node.right == null && node.val == targetSum)
                    return true;
                if (node.left != null) {
                    node.left.val += node.val;
                    deque.add(node.left);
                }
                if (node.right != null) {
                    node.right.val += node.val;
                    deque.add(node.right);
                }
                count--;
            }
        }
        return false;
    }
}
