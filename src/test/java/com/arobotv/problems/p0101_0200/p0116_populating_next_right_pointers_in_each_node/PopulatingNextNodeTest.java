package com.arobotv.problems.p0101_0200.p0116_populating_next_right_pointers_in_each_node;

import com.arobotv.utils.node.Node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PopulatingNextNodeTest {

    @Test
    void testConnect() {
        PopulatingNextNode populatingNextNode = new PopulatingNextNode();
        Node node = new Node(1, new Node(2, new Node(4), null), new Node(3));
        node = populatingNextNode.connect(node);
        Assertions.assertEquals(node.right, node.left.next);
    }

    @Test
    void testConnect2() {
        PopulatingNextNode populatingNextNode = new PopulatingNextNode();
        Node node = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
        node = populatingNextNode.connect(node);
        Assertions.assertEquals(node.right, node.left.next);
        Assertions.assertEquals(node.left.right, node.left.left.next);
        Assertions.assertEquals(node.right.left, node.left.right.next);
    }

    @Test
    void testConnect3() {
        PopulatingNextNode populatingNextNode = new PopulatingNextNode();
        Node node = new Node(1, new Node(2, new Node(4), null), new Node(3));
        populatingNextNode.connect(node, null);
        Assertions.assertEquals(node.right, node.left.next);
    }

    @Test
    void testConnect4() {
        PopulatingNextNode populatingNextNode = new PopulatingNextNode();
        Node node = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
        populatingNextNode.connect(node, null);
        Assertions.assertEquals(node.right, node.left.next);
        Assertions.assertEquals(node.left.right, node.left.left.next);
        Assertions.assertEquals(node.right.left, node.left.right.next);
    }

    @Test
    void testConnect5() {
        PopulatingNextNode populatingNextNode = new PopulatingNextNode();
        Node node = new Node(1, new Node(2), new Node(3));
        node = populatingNextNode.iterator(node);
        Assertions.assertEquals(node.right, node.left.next);
    }

    @Test
    void testConnect6() {
        PopulatingNextNode populatingNextNode = new PopulatingNextNode();
        Node node = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
        node = populatingNextNode.iterator(node);
        Assertions.assertEquals(node.right, node.left.next);
        Assertions.assertEquals(node.left.right, node.left.left.next);
        Assertions.assertEquals(node.right.left, node.left.right.next);
    }
}
