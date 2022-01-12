# 对称二叉树

给你一个二叉树的根节点 `root` ， 检查它是否轴对称。

## 分析

通过中序遍历获得的数列，如果是对称的，那么这颗树也是轴对称的。

### 1. 中序遍历递归

中序遍历时，同时执行左到右和右到左的遍历。递归返回时，自底向上的进行判断。

```java
    public static boolean isSymmtric(TreeNode root, TreeNode root2) {
        if (root == null && root2 == null)
            return true;
        if (!(root != null && root2 != null))
            return false;
        if (!isSymmtric(root.left, root2.right))
            return false;
        prevLeft = root;
        prevRight = root2;
        if (prevLeft.val != prevRight.val)
            return false;
        if (!isSymmtric(root.right, root2.left))
            return false;
        return true;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：36.4 MB, 在所有 Java 提交中击败了70.91%的用户