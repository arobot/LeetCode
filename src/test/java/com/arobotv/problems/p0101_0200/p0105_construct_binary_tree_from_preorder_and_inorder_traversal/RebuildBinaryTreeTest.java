package com.arobotv.problems.p0101_0200.p0105_construct_binary_tree_from_preorder_and_inorder_traversal;

import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RebuildBinaryTreeTest {
    static RebuildBinaryTree rebuildBinaryTree = new RebuildBinaryTree();

    @Test
    void testBuildTree() {
        int[] preorder = { 3, 9, 20, 15, 7 }, inorder = { 9, 3, 15, 20, 7 };
        TreeNode root = rebuildBinaryTree.buildTree(preorder, inorder);
        Assertions.assertEquals("[3, 9, 20, 15, 7]", TreeUtils.preOrderList(root).toString());
        Assertions.assertEquals("[9, 3, 15, 20, 7]", TreeUtils.inOrderList(root).toString());

        root = rebuildBinaryTree.buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
        Assertions.assertEquals("[3, 9, 20, 15, 7]", TreeUtils.preOrderList(root).toString());
        Assertions.assertEquals("[9, 3, 15, 20, 7]", TreeUtils.inOrderList(root).toString());
    }

    @Test
    void testBuildTree2() {
        int[] preorder = { 4,1,2,3 }, inorder = { 1,2,3,4 };
        TreeNode root = rebuildBinaryTree.buildTree(preorder, inorder);
        Assertions.assertEquals("[4, 1, 2, 3]", TreeUtils.preOrderList(root).toString());
        Assertions.assertEquals("[1, 2, 3, 4]", TreeUtils.inOrderList(root).toString());

        root = rebuildBinaryTree.buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
        Assertions.assertEquals("[4, 1, 2, 3]", TreeUtils.preOrderList(root).toString());
        Assertions.assertEquals("[1, 2, 3, 4]", TreeUtils.inOrderList(root).toString());
    }

    @Test
    void testBuildTree3() {
        int[] preorder = { 1,2,3,4 }, inorder = { 1,2,3,4 };
        TreeNode root = rebuildBinaryTree.buildTree(preorder, inorder);
        Assertions.assertEquals("[1, 2, 3, 4]", TreeUtils.preOrderList(root).toString());
        Assertions.assertEquals("[1, 2, 3, 4]", TreeUtils.inOrderList(root).toString());

        root = rebuildBinaryTree.buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
        Assertions.assertEquals("[1, 2, 3, 4]", TreeUtils.preOrderList(root).toString());
        Assertions.assertEquals("[1, 2, 3, 4]", TreeUtils.inOrderList(root).toString());
    }
}
