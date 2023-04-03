package com.arobotv.problems.p0601_p0700.p0653_tow_sum_iv_input_is_a_bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.node.TreeNode;

public class TowSumIvInputIsABstTest {
    @Test
    void testFindTarget() {
        TowSumIvInputIsABst twoSum = new TowSumIvInputIsABst();
        TreeNode root = TreeNode.of(5);
        root.setLeft(3).setRight(6).getLeft().setLeft(2).setRight(4);
        Assertions.assertTrue(twoSum.findTarget(root,9));
    }

    @Test
    void testFindTarget2() {
        TowSumIvInputIsABst twoSum = new TowSumIvInputIsABst();
        TreeNode root = TreeNode.of(5);
        root.setLeft(3).setRight(6).getLeft().setLeft(2).setRight(4);
        Assertions.assertFalse(twoSum.findTarget(root,28));
    }
}
