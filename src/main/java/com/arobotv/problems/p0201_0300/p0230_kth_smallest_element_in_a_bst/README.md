# 二叉搜索树中第K小的元素

## 分析

首先，我们要知道什么是**二叉搜索树**

- 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
- 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
- 它的左、右子树也分别为二叉排序树。

对二叉搜索树进行中序遍历后，可以得到一条有序序列。

所以，要寻找二叉搜索树中第`k`小的元素，实际上就是对二叉搜索树进行中序遍历时，找到第`k`个节点。

### 1. 递归法

```java
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
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：41.1 MB, 在所有 Java 提交中击败了10.21%的用户
