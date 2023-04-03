package com.arobotv.problems.p0201_0300.p0235_lowest_common_ancestor_of_a_binary_search_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.node.TreeNode;

public class LowestCommonAncestorOfABinarySearchTreeTest {
    @Test
    void testLowestCommonAncestor() {
        LowestCommonAncestorOfABinarySearchTree ancestor = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TreeNode.of(6);
        root.setLeft(2).setRight(8).getLeft().setLeft(0).setRight(4).getRight().setLeft(3).setRight(5);
        root.getRight().setLeft(7).setRight(9);
        Assertions.assertEquals(root.val, ancestor.lowestCommonAncestor(root, TreeNode.of(2), TreeNode.of(8)).val);
    }

    @Test
    void testLowestCommonAncestor2() {
        LowestCommonAncestorOfABinarySearchTree ancestor = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TreeNode.of(6);
        root.setLeft(2).setRight(8).getLeft().setLeft(0).setRight(4).getRight().setLeft(3).setRight(5);
        root.getRight().setLeft(7).setRight(9);
        Assertions.assertEquals(2, ancestor.lowestCommonAncestor(root, TreeNode.of(2), TreeNode.of(4)).val);
    }

    @Test
    void testLowestCommonAncestor3() {
        LowestCommonAncestorOfABinarySearchTree ancestor = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TreeNode.of(6);
        root.setLeft(2).setRight(8).getLeft().setLeft(0).setRight(4).getRight().setLeft(3).setRight(5);
        root.getRight().setLeft(7).setRight(9);
        Assertions.assertEquals(6, ancestor.lowestCommonAncestor(root, TreeNode.of(4), TreeNode.of(7)).val);
    }

    @Test
    void testLowestCommonAncestor4() {
        LowestCommonAncestorOfABinarySearchTree ancestor = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TreeNode.of(2);
        root.setLeft(1).setRight(3);
        Assertions.assertEquals(2, ancestor.lowestCommonAncestor(root, TreeNode.of(3), TreeNode.of(1)).val);
    }

    @Test
    void testLowestCommonAncestor5() {
        LowestCommonAncestorOfABinarySearchTree ancestor = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TreeNode.of(2);
        root.setLeft(1);
        Assertions.assertEquals(2, ancestor.lowestCommonAncestor(root, TreeNode.of(2), TreeNode.of(1)).val);
    }

    @Test
    void testLowestCommonAncestor6() {
        LowestCommonAncestorOfABinarySearchTree ancestor = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TreeNode.of(6);
        root.setLeft(2).setRight(8).getLeft().setLeft(0).setRight(4).getRight().setLeft(3).setRight(5);
        root.getRight().setLeft(7).setRight(9);
        Assertions.assertEquals(4, ancestor.lowestCommonAncestor(root, TreeNode.of(3), TreeNode.of(5)).val);
    }
}
