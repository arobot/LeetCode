package com.arobotv.problems.p0101_0200.p0101_symmetric_tree;

import com.arobotv.utils.node.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {
    static SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void testSingleRoot() {
        TreeNode root = new TreeNode(1);
        Assertions.assertTrue(symmetricTree.isSymmtric(root));
    }

    @Test
    void testNullLeft() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        Assertions.assertFalse(symmetricTree.isSymmtric(root));
    }

    @Test
    void testNullRight() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assertions.assertFalse(symmetricTree.isSymmtric(root));
    }
}
