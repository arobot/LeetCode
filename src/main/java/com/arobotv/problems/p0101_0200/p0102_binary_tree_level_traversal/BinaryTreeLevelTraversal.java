package com.arobotv.problems.p0101_0200.p0102_binary_tree_level_traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.arobotv.utils.node.TreeNode;

public class BinaryTreeLevelTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        return levelOrder(root, 0, list);
    }

    List<List<Integer>> levelOrder(TreeNode root, int level, List<List<Integer>> levelList) {
        if (root == null)
            return levelList;
        List<Integer> list;
        if (levelList.size() <= level) {
            list = new ArrayList<>();
            levelList.add(list);
        } else {
            list = levelList.get(level);
        }
        list.add(root.val);
        levelOrder(root.left, level + 1, levelList);
        return levelOrder(root.right, level + 1, levelList);
    }

    public List<List<Integer>> levelOrderIterator(TreeNode root) {
        if (root == null)
            return Collections.emptyList();
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int levelCount = queue.size();
            while (levelCount > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                levelCount--;
            }
            level.add(list);
        }
        return level;
    }
}
