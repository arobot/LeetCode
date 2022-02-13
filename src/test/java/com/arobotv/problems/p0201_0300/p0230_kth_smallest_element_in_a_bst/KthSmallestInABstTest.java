package com.arobotv.problems.p0201_0300.p0230_kth_smallest_element_in_a_bst;

import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthSmallestInABstTest {
    @Test
    void testKthSmall() {
        KthSmallestInABst kthSmallestInABst = new KthSmallestInABst();
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeUtils.printInOrder(root);
        Assertions.assertEquals(2, kthSmallestInABst.kthSmallest(root, 2));
        kthSmallestInABst.count=0;
        Assertions.assertEquals(1, kthSmallestInABst.kthSmallest(root, 1));
        kthSmallestInABst.count=0;
        Assertions.assertEquals(3, kthSmallestInABst.kthSmallest(root, 3));
    }

    @Test
    void testKthSmall2() {
        KthSmallestInABst kthSmallestInABst = new KthSmallestInABst();
        TreeNode root = new TreeNode(2, new TreeNode(1),null);
        TreeUtils.printInOrder(root);
        Assertions.assertEquals(2, kthSmallestInABst.kthSmallest(root, 2));
        kthSmallestInABst.count=0;
        Assertions.assertEquals(1, kthSmallestInABst.kthSmallest(root, 1));
    }
}
