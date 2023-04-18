package com.arobotv.problems.p1001_p1100.p1026_maximum_difference_between_node_and_ancestor;

import com.arobotv.utils.node.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestor {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了54.26%的用户
     */
    public int maxAncestorDiff(TreeNode root) {
        return dfsMaxDiff(root, root.val, root.val);
    }

    public int dfsMaxDiff(TreeNode root, int max, int min) {
        if (root == null)
            return 0;

        int diff = Math.max(Math.abs(root.val - max), Math.abs(root.val - min));
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        diff = Math.max(diff, dfsMaxDiff(root.left, max, min));
        diff = Math.max(diff, dfsMaxDiff(root.right, max, min));
        return diff;
    }
}
