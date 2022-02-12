package com.arobotv.problems.p0101_0200.p0116_populating_next_right_pointers_in_each_node;

import java.util.HashMap;
import java.util.Map;

import com.arobotv.utils.node.Node;

public class PopulatingNextNode {
    public Node connect(Node root) {
        connect(root, 0);
        return root;
    }

    Map<Integer, Node> levelNode = new HashMap<>();

    void connect(Node root, int level) {
        if (root == null)
            return;
        if (levelNode.containsKey(level)) {
            levelNode.get(level).next = root;
        }
        levelNode.put(level, root);
        connect(root.left, level + 1);
        connect(root.right, level + 1);
    }

    void connect(Node cur, Node next) {
        if (cur == null)
            return;
        cur.next = next;
        connect(cur.left, cur.right);
        connect(cur.right, cur.next == null ? null : cur.next.left);
    }

    Node iterator(Node root) {
        Node r = root;
        while (r!=null && r.left != null) {
            Node pre = r;
            Node cur = new Node(0);
            while (pre != null) {
                cur.next = pre.left;
                cur.next.next = pre.right;
                cur = pre.right;
                pre = pre.next;
            }
            r = r.left;
        }
        return root;
    }
}
