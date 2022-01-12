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

### 2. 左右对比递归

通过不断的交换对比左右两个节点的值，并不断递归解决

```java
    public boolean isSymmtric2(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (!(left != null && right != null))
            return false;
        if (left.val != right.val)
            return false;
        return isSymmtric2(left.left, right.right) && isSymmtric2(left.right, right.left);
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：36.5 MB, 在所有 Java 提交中击败了47.31%的用户

### 3. 迭代方式

其实和`方法2`的逻辑上是相通的，都是不断的获取左右两个节点的值进行比较。

```java
    public boolean iteration(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll(), right = queue.poll();
            if (left == null && right == null)
                continue;
            if (left == null ^ right == null)
                return false;
            if (left.val != right.val)
                return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了24.60%的用户
>
> 内存消耗：37.9 MB, 在所有 Java 提交中击败了5.05%的用户
