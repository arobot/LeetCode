package com.arobotv.problems.p0701_p0800.p0701_insert_into_a_binary_search_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.PrintUtils;
import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

public class InsertIntoABinarySearchTreeTest {
    @Test
    void testInsertIntoBST() {
        InsertIntoABinarySearchTree insert = new InsertIntoABinarySearchTree();
        TreeNode root = TreeNode.of(4);
        root.setLeft(2).setRight(7).getLeft().setLeft(1).setRight(3);
        insert.insertIntoBST(root, 5);
        Assertions.assertEquals("[4,2,7,1,3,5]", PrintUtils.printArrayT(TreeUtils.levelOrderList(root)));
    }

    @Test
    void testInsertIntoBST2() {
        InsertIntoABinarySearchTree insert = new InsertIntoABinarySearchTree();
        TreeNode root = TreeNode.of(40);
        root.setLeft(20).setRight(60).getLeft().setLeft(10).setRight(30);
        root.getRight().setLeft(50).setRight(70);
        insert.insertIntoBST(root, 25);
        Assertions.assertEquals("[40,20,60,10,30,50,70,25]", PrintUtils.printArrayT(TreeUtils.levelOrderList(root)));
    }
}
