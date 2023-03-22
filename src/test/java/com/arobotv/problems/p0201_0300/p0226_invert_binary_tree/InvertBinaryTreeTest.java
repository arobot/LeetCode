package com.arobotv.problems.p0201_0300.p0226_invert_binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.PrintUtils;
import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

public class InvertBinaryTreeTest {
    @Test
    void testInvertTree() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode node = TreeNode.of(4);
        node.setLeft(2).setRight(7);
        node.getLeft().setLeft(1).setRight(3);
        node.getRight().setLeft(6).setRight(9);
        PrintUtils.printArrayT(TreeUtils.levelOrderList(node));
        node = invertBinaryTree.invertTree(node);
        Assertions.assertEquals("[4,7,2,9,6,3,1]", PrintUtils.printArrayT(TreeUtils.levelOrderList(node)));
    }
}
