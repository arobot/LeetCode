package com.arobotv.problems.p0001_p0100.p0094_binary_tree_inorder_traversal;

import java.util.List;

import com.arobotv.utils.node.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeInorderTraversalTest {

    
    @Test
    void testInorderTraversal() {
        TreeNode treeNode =new TreeNode(1, new TreeNode(2), new TreeNode(3));
        BinaryTreeInorderTraversal binaryTreeInorderTraversal =new BinaryTreeInorderTraversal();
        List<Integer> inorderTraversal = binaryTreeInorderTraversal.inorderTraversal(treeNode);
        Assertions.assertEquals("[2, 1, 3]", inorderTraversal.toString());
    }

    @Test
    void testInorderTraversal2() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal =new BinaryTreeInorderTraversal();
        TreeNode treeNode =new TreeNode(1,null, new TreeNode(3));
        List<Integer> inorderTraversal = binaryTreeInorderTraversal.inorderTraversal(treeNode);
        Assertions.assertEquals("[1, 3]", inorderTraversal.toString());
    }

    @Test
    void testInorderTraversal3() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal =new BinaryTreeInorderTraversal();
        TreeNode treeNode =new TreeNode(1, new TreeNode(2),null);
        List<Integer> inorderTraversal = binaryTreeInorderTraversal.inorderTraversal(treeNode);
        Assertions.assertEquals("[2, 1]", inorderTraversal.toString());
    }

    @Test
    void testInorderTraversal4() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal =new BinaryTreeInorderTraversal();
        TreeNode treeNode =null;
        List<Integer> inorderTraversal = binaryTreeInorderTraversal.inorderTraversal(treeNode);
        Assertions.assertEquals("[]", inorderTraversal.toString());
    }

    @Test
    void testInorderTraversal5() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal =new BinaryTreeInorderTraversal();
        TreeNode treeNode =new TreeNode(1, null,null);
        List<Integer> inorderTraversal = binaryTreeInorderTraversal.inorderTraversal(treeNode);
        Assertions.assertEquals("[1]", inorderTraversal.toString());
    }
}
