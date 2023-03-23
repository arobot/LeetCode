package com.arobotv.problems.p0101_0200.p0112_path_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.PrintUtils;
import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

public class PathSumTest {
    @Test
    void testHasPathSum() {
        PathSum pathSum = new PathSum();
        TreeNode root = TreeNode.of(5);
        root.setLeft(4).setRight(8);
        root.getLeft().setLeft(11).getLeft().setLeft(7).setRight(2);
        root.getRight().setLeft(13).setRight(4).getRight().setRight(1);
        PrintUtils.printArrayT(TreeUtils.levelOrderList(root));
        Assertions.assertTrue(pathSum.hasPathSum(root, 22));
    }

    @Test
    void testHasPathSum2() {
        PathSum pathSum = new PathSum();
        TreeNode root = TreeNode.of(5);
        root.setLeft(4).setRight(8);
        root.getLeft().setLeft(11).getLeft().setLeft(7).setRight(2);
        root.getRight().setLeft(13).setRight(4).getRight().setRight(1);
        PrintUtils.printArrayT(TreeUtils.levelOrderList(root));
        Assertions.assertTrue(pathSum.hasPathSum(root, 27));
    }

    @Test
    void testHasPathSum3() {
        PathSum pathSum = new PathSum();
        TreeNode root = TreeNode.of(5);
        root.setLeft(4).setRight(8);
        root.getLeft().setLeft(11).getLeft().setLeft(7).setRight(2);
        root.getRight().setLeft(13).setRight(4).getRight().setRight(1);
        PrintUtils.printArrayT(TreeUtils.levelOrderList(root));
        Assertions.assertFalse(pathSum.hasPathSum(root, 5));
    }

    @Test
    void testHasPathSum4() {
        PathSum pathSum = new PathSum();
        TreeNode root = null;
        Assertions.assertFalse(pathSum.hasPathSum(root, 0));
    }
}
