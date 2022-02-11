# 从前序和中序遍历序列构造二叉树

## 分析

前序遍历时父节点在前，中序遍历是父节点在中间。通过这两个特征，很容易构建出原始二叉树。

### 1. 递归重组

```java
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0)
            return null;
        if (inorder.length == 1)
            return new TreeNode(inorder[0]);
        int pVal = preorder[0];
        TreeNode pNode = new TreeNode(pVal);
        int[] left = splitArray(inorder, pVal, true);
        pNode.left = buildTree(splitArray(preorder, pVal, false), left);
        pNode.right = buildTree(
                Arrays.copyOfRange(preorder, left.length + 1, preorder.length), splitArray(inorder, pVal, false));
        return pNode;
    }

    int[] splitArray(int[] nums, int split, boolean left) {
        int index = 0;
        for (int i : nums) {
            if (i == split)
                break;
            index++;
        }
        return left ? Arrays.copyOfRange(nums, 0, index) : Arrays.copyOfRange(nums, index + 1, nums.length);
    }
```

> 执行用时：13 ms, 在所有 Java 提交中击败了5.42%的用户
>
> 内存消耗：73 MB, 在所有 Java 提交中击败了5.98%的用户

### 2. 递归重组优化

上述过程，有不少的新数组生成，可以通过数组边界移动避免。

```java
    public TreeNode buildTree(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (iStart >= iEnd)
            return null;
        if (iEnd - iStart == 1)
            return new TreeNode(inorder[iStart]);
        int pVal = preorder[pStart];
        TreeNode pNode = new TreeNode(pVal);
        int pIndexAtInOrder = findIndex(inorder, pVal);
        int leftSize = pIndexAtInOrder - iStart;
        if (leftSize > 0)
            pNode.left = buildTree(preorder, pStart + 1, pStart + leftSize + 1, inorder, iStart, pIndexAtInOrder);
        pNode.right = buildTree(preorder, pStart + leftSize + 1, pEnd, inorder, pIndexAtInOrder + 1, iEnd);
        return pNode;
    }

    int findIndex(int[] nums, int target) {
        int index = 0;
        for (int i : nums) {
            if (i == target)
                return index;
            index++;
        }
        return index;
    }
```

> 执行用时：3 ms, 在所有 Java 提交中击败了54.43%的用户
>
> 内存消耗：40.8 MB, 在所有 Java 提交中击败了17.64%的用户
