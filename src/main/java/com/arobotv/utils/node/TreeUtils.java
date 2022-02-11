package com.arobotv.utils.node;

import java.util.LinkedList;

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

}
