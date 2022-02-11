# 二叉树的锯齿形层序遍历

## 分析

首先思考一下，层序遍历的顺序是什么。

该题目在层序遍历的基础上，到每一层后还需要变换遍历的方向。具体来说就是奇数层从左至右，偶数层从右至左。

### 1. 递归法

```java
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
        if (level % 2 == 0)
            list.add(root.val);
        else
            list.add(0, root.val);
        levelOrder(root.left, level + 1, levelList);
        return levelOrder(root.right, level + 1, levelList);
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：39.7 MB, 在所有 Java 提交中击败了12.48%的用户

### 2. 迭代法

```java
    public List<List<Integer>> levelOrderIterator(TreeNode root) {
        if (root == null)
            return Collections.emptyList();
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelIndex = level.size();
            List<Integer> list = new ArrayList<>();
            int levelCount = queue.size();
            while (levelCount > 0) {
                TreeNode node = queue.poll();
                if (levelIndex % 2 == 0)
                    list.add(node.val);
                else
                    list.add(0, node.val);
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
```

> 执行用时：1 ms, 在所有 Java 提交中击败了90.81%的用户
>
> 内存消耗：40 MB, 在所有 Java 提交中击败了10.20%的用户
