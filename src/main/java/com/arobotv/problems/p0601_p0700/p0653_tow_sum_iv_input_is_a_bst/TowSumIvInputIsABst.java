package com.arobotv.problems.p0601_p0700.p0653_tow_sum_iv_input_is_a_bst;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.arobotv.utils.node.TreeNode;

public class TowSumIvInputIsABst {
    public boolean findTarget(TreeNode root, int k) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        Set<Integer> map = new HashSet<>();
        while (!deque.isEmpty()) {
            int count = deque.size();
            while (count > 0) {
                TreeNode node = deque.poll();
                if (map.contains(k-node.val))
                    return true;
                map.add(node.val);
                if (node.left != null)
                    deque.add(node.left);
                if (node.right != null)
                    deque.add(node.right);
                count--;
            }
        }
        return false;
    }
}
