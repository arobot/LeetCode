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
        Assertions.assertTrue(symmetricTree.iteration(root));
        Assertions.assertTrue(symmetricTree.isSymmtric2(root.left,root.right));
    }

    @Test
    void testNullLeft() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        Assertions.assertFalse(symmetricTree.isSymmtric(root));
        Assertions.assertFalse(symmetricTree.iteration(root));
        Assertions.assertFalse(symmetricTree.isSymmtric2(root.left,root.right));
    }

    @Test
    void testNullRight() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assertions.assertFalse(symmetricTree.isSymmtric(root));
        Assertions.assertFalse(symmetricTree.iteration(root));
        Assertions.assertFalse(symmetricTree.isSymmtric2(root.left,root.right));
    }

    @Test
    void testUnSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Assertions.assertFalse(symmetricTree.isSymmtric2(root.left,root.right));
        Assertions.assertFalse(symmetricTree.iteration(root));
        Assertions.assertFalse(symmetricTree.isSymmtric(root));
    }

    @Test
    void testSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        Assertions.assertTrue(symmetricTree.isSymmtric(root));
        Assertions.assertTrue(symmetricTree.iteration(root));
        Assertions.assertTrue(symmetricTree.isSymmtric2(root.left,root.right));

        root.left = new TreeNode(2, new TreeNode(3), null);
        root.right = new TreeNode(2, null, new TreeNode(3));
        Assertions.assertTrue(symmetricTree.isSymmtric(root));
        Assertions.assertTrue(symmetricTree.iteration(root));
        Assertions.assertTrue(symmetricTree.isSymmtric2(root.left,root.right));
    }
}
