# 二叉树的序列化与反序列化

## 分析

二叉树通常有DFS和BFS两种遍历模型。其中DFS有前序遍历、中序遍历和后序遍历三种；BFS则以层序遍历为代表。层序遍历在阅读二叉树树的结构时最为直观。

这里选择层序遍历为切入口开始遍历。

### 1. 层序遍历

```java
    public String serialize(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return result.toString();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                result.add(null);
            } else {
                result.add(node.val);
                queue.add(node.left);
                queue.add(node.right);

            }
        }
        return result.toString();
    }

    public TreeNode deserialize(String data) {
        data = data.substring(1, data.length() - 1);
        if (data.length() == 0)
            return null;
        String[] nums = data.split(", ");
        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(nums[index++]));
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                String num = nums[index++];
                if (!"null".equals(num)) {
                    node.left = new TreeNode(Integer.valueOf(num));
                    queue.add(node.left);
                }
                num = nums[index++];
                if (!"null".equals(num)) {
                    node.right = new TreeNode(Integer.valueOf(num));
                    queue.add(node.right);
                }
            }

        }
        return root;
    }
```

> 执行用时：34 ms, 在所有 Java 提交中击败了23.73%的用户
>
> 内存消耗：43.2 MB, 在所有 Java 提交中击败了26.66%的用户
