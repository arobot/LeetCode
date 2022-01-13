# 将有序数组转换为二叉搜索树

给你一个整数数组 `nums` ，其中元素已经按 **升序** 排列，请你将其转换为一棵 **高度平衡** 二叉搜索树。

**高度平衡** 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。

## 分析

二叉搜索树通过中序遍历获得的序列恰好就是一个有序序列。所以，将该数组重新构建为一颗按照中序遍历的树，就一定是一颗二叉搜索树。

### 1. 分治递归

由二叉树中序遍历的性质推导而出，处于数组中间的值必然是根节点才能左右高度平衡。如果是偶数个节点，那么任选中间位置两个节点之一的值都可以做根。

选择好根节点之后，将根节点左右的两个数组分而治之，不断的构造成子树并设置为根的左右节点即可。

```java
    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：38.1 MB, 在所有 Java 提交中击败了64.58%的用户
