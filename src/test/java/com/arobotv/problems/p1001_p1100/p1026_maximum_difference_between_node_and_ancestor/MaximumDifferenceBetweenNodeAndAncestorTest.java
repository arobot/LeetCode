package com.arobotv.problems.p1001_p1100.p1026_maximum_difference_between_node_and_ancestor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.node.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestorTest {
    /*
     * 输入：root = [8,3,10,1,6,null,14,null,null,4,7,13]
     * 输出：7
     */
    @Test
    void testMaxAncestorDiff() {
        MaximumDifferenceBetweenNodeAndAncestor maximumDifferenceBetweenNodeAndAncestor = new MaximumDifferenceBetweenNodeAndAncestor();
        TreeNode root = TreeNode.of(8);
        root.setLeft(3).setRight(10).getLeft().setLeft(1).setRight(6).getRight().setLeft(4).setRight(7);
        root.getRight().setRight(14).getRight().setLeft(13);
        Assertions.assertEquals(7, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
    }

    /*
     * 输入：root = [1,null,2,null,0,3]
     * 输出：3
     */
    @Test
    void testMaxAncestorDiff2() {
        MaximumDifferenceBetweenNodeAndAncestor maximumDifferenceBetweenNodeAndAncestor = new MaximumDifferenceBetweenNodeAndAncestor();
        TreeNode root = TreeNode.of(1);
        root.setRight(2).getRight().setRight(0).getRight().setLeft(3);
        Assertions.assertEquals(3, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
    }
}
