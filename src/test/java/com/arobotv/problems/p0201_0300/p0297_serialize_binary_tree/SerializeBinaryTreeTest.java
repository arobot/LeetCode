package com.arobotv.problems.p0201_0300.p0297_serialize_binary_tree;

import com.arobotv.utils.node.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SerializeBinaryTreeTest {
    static SerializeBinaryTree serializeBinaryTree = new SerializeBinaryTree();

    @Test
    void testDeserialize() {
        String s = "[1, 2, 3, null, null, null, 5, null, null]";
        Assertions.assertEquals(s,
                serializeBinaryTree.serialize(serializeBinaryTree.deserialize(s)));
    }

    @Test
    void testSerialize() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3, null, new TreeNode(5)));
        Assertions.assertEquals("[1, 2, 3, null, null, null, 5, null, null]", serializeBinaryTree.serialize(treeNode));
    }

    @Test
    void testSerialize2() {
        TreeNode treeNode = new TreeNode(1);
        Assertions.assertEquals("[1, null, null]", serializeBinaryTree.serialize(treeNode));
    }

    @Test
    void testDeserialize2() {
        String s = "[1, null, null]";
        Assertions.assertEquals(s,
                serializeBinaryTree.serialize(serializeBinaryTree.deserialize(s)));
    }

    @Test
    void testSerialize3() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2),
                new TreeNode(3, new TreeNode(4, new TreeNode(6), new TreeNode(7)), new TreeNode(5)));
        Assertions.assertEquals("[1, 2, 3, null, null, 4, 5, 6, 7, null, null, null, null, null, null]",
                serializeBinaryTree.serialize(treeNode));
    }

    @Test
    void testDeserialize3() {
        String s = "[1, 2, 3, null, null, 4, 5, 6, 7, null, null, null, null, null, null]";
        Assertions.assertEquals(s,
                serializeBinaryTree.serialize(serializeBinaryTree
                        .deserialize(s)));
    }
}
