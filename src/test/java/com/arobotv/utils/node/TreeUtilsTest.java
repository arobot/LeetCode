package com.arobotv.utils.node;

import java.util.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeUtilsTest {
    @Test
    void testInOrderList() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        LinkedList<Integer> inOrderList = TreeUtils.inOrderList(treeNode, new LinkedList<>());
        System.out.println(inOrderList.toString());
        TreeUtils.printInOrder(treeNode);
        Assertions.assertEquals("[2, 1, 3]", inOrderList.toString());
    }

    @Test
    void testPostOrderList() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        LinkedList<Integer> postOrderList = TreeUtils.postOrderList(treeNode, new LinkedList<>());
        System.out.println(postOrderList.toString());
        Assertions.assertEquals("[2, 3, 1]", postOrderList.toString());
    }

    @Test
    void testPreOrderList() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        LinkedList<Integer> preOrderList = TreeUtils.preOrderList(treeNode, new LinkedList<>());
        System.out.println(preOrderList.toString());
        Assertions.assertEquals("[1, 2, 3]", preOrderList.toString());
    }
}
