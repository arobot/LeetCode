package com.arobotv.problems.p0201_0300.p0297_serialize_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.arobotv.utils.node.TreeNode;

public class SerializeBinaryTree {
    public String serialize(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return result.toString();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                result.add(null);
            } else {
                result.add(node.val);
                queue.add(node.left);
                queue.add(node.right);

            }
        }
        return result.toString();
    }

    public TreeNode deserialize(String data) {
        data = data.substring(1, data.length() - 1);
        if (data.length() == 0)
            return null;
        String[] nums = data.split(", ");
        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(nums[index++]));
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                String num = nums[index++];
                if (!"null".equals(num)) {
                    node.left = new TreeNode(Integer.valueOf(num));
                    queue.add(node.left);
                }
                num = nums[index++];
                if (!"null".equals(num)) {
                    node.right = new TreeNode(Integer.valueOf(num));
                    queue.add(node.right);
                }
            }

        }
        return root;
    }
}
