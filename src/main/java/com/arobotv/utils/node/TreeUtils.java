package com.arobotv.utils.node;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {
    public static TreeNode fullBinaryTree(int root, int level, int maxLevel) {
        if (level == maxLevel - 1) {
            return new TreeNode(root);
        }
        level++;
        TreeNode node = new TreeNode(root);
        node.left = fullBinaryTree(2 * root, level, maxLevel);
        node.right = fullBinaryTree(2 * root + 1, level, maxLevel);
        return node;
    }

    public static void printPreOrder(TreeNode node) {
        System.out.println(preOrderList(node, new LinkedList<>()));
    }

    public static void printInOrder(TreeNode node) {
        System.out.println(inOrderList(node, new LinkedList<>()));
    }

    public static void printPostOrder(TreeNode node) {
        System.out.println(postOrderList(node, new LinkedList<>()));
    }

    public static LinkedList<Integer> preOrderList(TreeNode node) {
        return preOrderList(node, new LinkedList<>());
    }

    public static LinkedList<Integer> inOrderList(TreeNode node) {
        return inOrderList(node, new LinkedList<>());
    }

    public static LinkedList<Integer> postOrderList(TreeNode node) {
        return postOrderList(node, new LinkedList<>());
    }

    public static LinkedList<Integer> levelOrderList(TreeNode node) {
        return levelOrderList(node, new LinkedList<>());
    }

    static LinkedList<Integer> preOrderList(TreeNode node, LinkedList<Integer> nums) {
        if (node == null)
            return nums;
        nums.add(node.val);
        preOrderList(node.left, nums);
        preOrderList(node.right, nums);
        return nums;
    }

    static LinkedList<Integer> inOrderList(TreeNode node, LinkedList<Integer> nums) {
        if (node == null)
            return nums;
        inOrderList(node.left, nums);
        nums.add(node.val);
        inOrderList(node.right, nums);
        return nums;
    }

    static LinkedList<Integer> postOrderList(TreeNode node, LinkedList<Integer> nums) {
        if (node == null)
            return nums;
        postOrderList(node.left, nums);
        postOrderList(node.right, nums);
        nums.add(node.val);
        return nums;
    }

    static LinkedList<Integer> levelOrderList(TreeNode node, LinkedList<Integer> nums) {
        if (node == null)
            return nums;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode n = queue.poll();
                nums.add(n.getVal());
                if (n.left != null)
                    queue.add(n.left);
                if (n.right != null)
                    queue.add(n.right);
                count--;
            }
        }
        return nums;
    }

}
