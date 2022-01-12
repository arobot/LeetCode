package com.arobotv.problems.p0101_0200.p0102_binary_tree_level_traversal;

import java.util.List;

import com.arobotv.utils.node.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeLevelTraversalTest {

    static BinaryTreeLevelTraversal traversal = new BinaryTreeLevelTraversal();

    @Test
    void testNullRoot() {
        TreeNode root = null;
        List<List<Integer>> levelOrder = traversal.levelOrder(root);
        Assertions.assertEquals(0, levelOrder.size());
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(0, levelOrder.size());
    }

    @Test
    void testSingleRoot() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> levelOrder = traversal.levelOrder(root);
        Assertions.assertEquals(1, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(1, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
    }

    @Test
    void testMuiltLevel() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<List<Integer>> levelOrder = traversal.levelOrder(root);
        Assertions.assertEquals(2, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(2, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
    }

    @Test
    void testMuiltLevelTwo() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        List<List<Integer>> levelOrder = traversal.levelOrder(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
        Assertions.assertEquals(4, levelOrder.get(2).get(0));
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
        Assertions.assertEquals(4, levelOrder.get(2).get(0));

        root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        levelOrder = traversal.levelOrder(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
        Assertions.assertEquals(4, levelOrder.get(2).get(0));
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
        Assertions.assertEquals(4, levelOrder.get(2).get(0));

        root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(4)),
                new TreeNode(3, new TreeNode(5, new TreeNode(6), null), null));
        levelOrder = traversal.levelOrder(root);
        Assertions.assertEquals(4, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
        Assertions.assertEquals(4, levelOrder.get(2).get(0));
        Assertions.assertEquals(5, levelOrder.get(2).get(1));
        Assertions.assertEquals(6, levelOrder.get(3).get(0));
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(4, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        Assertions.assertEquals(2, levelOrder.get(1).get(0));
        Assertions.assertEquals(3, levelOrder.get(1).get(1));
        Assertions.assertEquals(4, levelOrder.get(2).get(0));
        Assertions.assertEquals(5, levelOrder.get(2).get(1));
        Assertions.assertEquals(6, levelOrder.get(3).get(0));
    }

}
