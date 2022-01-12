package com.arobotv.problems.p0101_0200.p0101_symmetric_tree;

import java.util.LinkedList;
import java.util.Queue;

import com.arobotv.utils.node.TreeNode;

public class SymmetricTree {

    TreeNode prevLeft;
    TreeNode prevRight;

    public boolean isSymmtric(TreeNode root) {
        return isSymmtric(root, root);
    }

    // 前后倒序中序遍历递归
    public boolean isSymmtric(TreeNode root, TreeNode root2) {
        if (root == null && root2 == null)
            return true;
        if (root == null ^ root2 == null)
            return false;
        if (!isSymmtric(root.left, root2.right))
            return false;
        prevLeft = root;
        prevRight = root2;
        if (prevLeft.val != prevRight.val)
            return false;
        if (!isSymmtric(root.right, root2.left))
            return false;
        return true;
    }

    public boolean isSymmtric2(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (!(left != null && right != null))
            return false;
        if (left.val != right.val)
            return false;
        return isSymmtric2(left.left, right.right) && isSymmtric2(left.right, right.left);
    }

    public boolean iteration(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll(), right = queue.poll();
            if (left == null && right == null)
                continue;
            if (left == null ^ right == null)
                return false;
            if (left.val != right.val)
                return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
