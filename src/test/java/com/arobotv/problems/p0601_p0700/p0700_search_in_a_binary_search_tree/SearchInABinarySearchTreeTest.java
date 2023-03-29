package com.arobotv.problems.p0601_p0700.p0700_search_in_a_binary_search_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.PrintUtils;
import com.arobotv.utils.node.TreeNode;
import com.arobotv.utils.node.TreeUtils;

public class SearchInABinarySearchTreeTest {
    @Test
    void testSearchBST() {
        TreeNode root = TreeNode.of(4);
        root.setLeft(2).setRight(7).getLeft().setLeft(1).setRight(3);
        SearchInABinarySearchTree searchTree = new SearchInABinarySearchTree();
        TreeNode node = searchTree.searchBST(root, 2);
        Assertions.assertEquals("[2,1,3]", PrintUtils.printArrayT(TreeUtils.preOrderList(node)));
    }

    @Test
    void testSearchBST2() {
        TreeNode root = TreeNode.of(4);
        root.setLeft(2).setRight(7).getLeft().setLeft(1).setRight(3);
        SearchInABinarySearchTree searchTree = new SearchInABinarySearchTree();
        TreeNode node = searchTree.searchBST(root, 5);
        Assertions.assertEquals("[]", PrintUtils.printArrayT(TreeUtils.preOrderList(node)));
    }

    @Test
    void testSearchBST3() {
        TreeNode root = TreeNode.of(4);
        root.setLeft(2).setRight(7).getLeft().setLeft(1).setRight(3);
        SearchInABinarySearchTree searchTree = new SearchInABinarySearchTree();
        TreeNode node = searchTree.searchBST2(root, 2);
        Assertions.assertEquals("[2,1,3]", PrintUtils.printArrayT(TreeUtils.preOrderList(node)));
    }

    @Test
    void testSearchBST4() {
        TreeNode root = TreeNode.of(4);
        root.setLeft(2).setRight(7).getLeft().setLeft(1).setRight(3);
        SearchInABinarySearchTree searchTree = new SearchInABinarySearchTree();
        TreeNode node = searchTree.searchBST2(root, 5);
        Assertions.assertEquals("[]", PrintUtils.printArrayT(TreeUtils.preOrderList(node)));
    }
}
