package com.arobotv.problems.p0101_0200.p0145_binary_tree_postorder_tranveral;

import java.util.ArrayList;
import java.util.List;

import com.arobotv.utils.node.TreeNode;

public class BinaryTreePostorderTranveral {
    public List<Integer> resultList = new ArrayList<>();

    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了84.14%的用户
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            resultList.add(root.val);
        }
        return resultList;
    }
}