# 验证二叉搜索树

给你一个二叉树的根节点 `root` ，判断其是否是一个有效的二叉搜索树。

**有效**二叉搜索树定义如下：

- 节点的左子树只包含 **小于** 当前节点的数。
- 节点的右子树只包含 **大于** 当前节点的数。
- 所有左子树和右子树自身必须也是二叉搜索树。

## 分析

递归思想第一时间上头，一次次判定左右子树是否满足定义。

### 1. 带上下限递归

```java
    public static boolean isValidBST(TreeNode root) {
        return valid(root, Long.valueOf(Integer.MIN_VALUE) - 1, Long.valueOf(Integer.MAX_VALUE) + 1);
    }

    public static boolean valid(TreeNode node, Long min, Long max) {
        if (node == null)
            return true;
        if (node.val <= min || max <= node.val)
            return false;
        return valid(node.left, min, Long.valueOf(node.val)) && valid(node.right, Long.valueOf(node.val), max);
    }
```

这里之所以要带上上下限一起参与递归，是因为对于任意节点的子树，其左子树上的所有节点值必须小于该节点的值，同时其右子树上所有节点值必须大于该节点的值。

### 2. 中序遍历

这个思路，只能说远离数据结构太久了。第一时间想到了，也没有往解题的方向来思考。中序遍历的结果和题目要求的顺序一致，可以依次判断遍历的结果是否满足要求即可。

```java
    //中序遍历
    static TreeNode prev;

    public static boolean validMiddleFirst(TreeNode root) {
        if (root == null)
            return true;
        if (!validMiddleFirst(root.left))
            return false;
        if (prev != null && prev.val >= root.val)
            return false;
        prev = root;
        if (!validMiddleFirst(root.right))
            return false;
        return true;
    }
```

中序遍历到最左叶子节点时开始赋值并逐渐递归出栈开始进行判定。