package com.arobotv.problems.p0201_0300.p0230_kth_smallest_element_in_a_bst;

import com.arobotv.utils.node.TreeNode;

public class KthSmallestInABst {
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;
        int v = kthSmallest(root.left, k);
        if (++count == k)
            return root.val;
        v += kthSmallest(root.right, k);
        return v;
    }
}
