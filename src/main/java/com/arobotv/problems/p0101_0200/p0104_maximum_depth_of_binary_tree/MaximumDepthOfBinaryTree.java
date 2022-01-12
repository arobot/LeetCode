package com.arobotv.problems.p0101_0200.p0104_maximum_depth_of_binary_tree;

import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode node = TreeUtils.fullBinaryTree(1, 0, 2);
        System.out.println(maxDepth(node));
    }
}
