# 二叉树的中序遍历

## 分析

中序遍历就是按照 `左-中-右` 的顺序进行遍历的方式。

通常二叉树的遍历使用递归是非常直观的解法。

### 1. 递归遍历

```java
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：39.2 MB, 在所有 Java 提交中击败了12.68%的用户

### 2. 迭代遍历

```java
    public List<Integer> inorderTraversal2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            //向下加入左子树到叶节点
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            //回溯根和右节点
            if (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                list.add(node.val);
                root = node.right;
            }
        }
        return list;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：39.7 MB, 在所有 Java 提交中击败了5.00%的用户
