# 二叉树的层序遍历

给你二叉树的根节点 `root` ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。

## 分析

将层级和节点绑定进行递归遍历。即每往下一层，层级数加1。同时，用一个 `List<List<Integer>>` 对象，一直跟踪列表的变化。也是深度优先思想。

### 1. 递归

```java
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
```

这里有一点取巧的是，当前`levelList`的长度和`level`是息息相关的，必须要先行构造。不过整个过程实际和深度无关了。

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：38.8 MB, 在所有 Java 提交中击败了12.83%的用户

### 2. 迭代版本

迭代时，使用一个队列暂存当前层的所有节点数据。依次获取该层所有的val后，将该层所有节点的子节点添加到队列中。该方式依赖于队列先入先出的特性。广度优先思想。

```java
    public List<List<Integer>> levelOrderIterator(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        if(root==null)
            return level;
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
```

> 执行用时：1 ms, 在所有 Java 提交中击败了89.82%的用户
>
> 内存消耗：38.5 MB, 在所有 Java 提交中击败了74.68%的用户
