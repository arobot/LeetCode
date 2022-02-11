package com.arobotv.problems.p0101_0200.p0103_binary_tree_zigzag_level_order_traversal;

import java.util.List;

import com.arobotv.utils.node.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigzagOrderTraversalTest {
    static ZigzagOrderTraversal traversal = new ZigzagOrderTraversal();

    @Test
    void testNullRoot() {
        TreeNode root = null;
        List<List<Integer>> levelOrder = traversal.zigzagLevelOrder(root);
        Assertions.assertEquals(0, levelOrder.size());
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(0, levelOrder.size());
    }

    @Test
    void testSingleRoot() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> levelOrder = traversal.zigzagLevelOrder(root);
        Assertions.assertEquals(1, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(1, levelOrder.size());
        Assertions.assertEquals(1, levelOrder.get(0).get(0));
    }

    @Test
    void testMuiltLevel() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<List<Integer>> levelOrder = traversal.zigzagLevelOrder(root);
        Assertions.assertEquals(2, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2]]", levelOrder.toString());
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(2, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2]]", levelOrder.toString());
    }

    @Test
    void testMuiltLevelTwo() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        List<List<Integer>> levelOrder = traversal.zigzagLevelOrder(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2], [4]]", levelOrder.toString());
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2], [4]]", levelOrder.toString());

        root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        levelOrder = traversal.zigzagLevelOrder(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2], [4]]", levelOrder.toString());
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(3, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2], [4]]", levelOrder.toString());

        root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(4)),
                new TreeNode(3, new TreeNode(5, new TreeNode(6), null), null));
        levelOrder = traversal.zigzagLevelOrder(root);
        Assertions.assertEquals(4, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2], [4, 5], [6]]", levelOrder.toString());
        levelOrder = traversal.levelOrderIterator(root);
        Assertions.assertEquals(4, levelOrder.size());
        Assertions.assertEquals("[[1], [3, 2], [4, 5], [6]]", levelOrder.toString());
    }
}
