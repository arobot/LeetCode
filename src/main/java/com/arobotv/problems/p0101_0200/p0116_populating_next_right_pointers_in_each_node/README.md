# 填充每个节点的下一个右侧节点指针

## 分析

这里和层序遍历的逻辑就非常的类似。在每一层的节点，依次遍历后并暂存当前节点，并在下一次切换前先进行next赋值。

### 1. 递归法

通过使用一个HashMap存储每一层的节点以便后面遍历使用。

```java
    public Node connect(Node root) {
        connect(root, 0);
        return root;
    }

    Map<Integer, Node> levelNode = new HashMap<>();

    void connect(Node root, int level) {
        if (root == null)
            return;
        if (levelNode.containsKey(level)) {
            levelNode.get(level).next = root;
        }
        levelNode.put(level, root);
        connect(root.left, level + 1);
        connect(root.right, level + 1);
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了68.01%的用户
>
> 内存消耗：41.3 MB, 在所有 Java 提交中击败了11.93%的用户

### 2. 递归优化

递归的目的就是通过递归的操作解决节点的左右子树的问题。现在，既然有`next`节点保存右侧信息，那么可以借助该节点解决问题。

```java
    void connect(Node cur, Node next) {
        if (cur == null)
            return;
        cur.next = next;
        connect(cur.left, cur.right);
        connect(cur.right, cur.next == null ? null : cur.next.left);
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：41.7 MB, 在所有 Java 提交中击败了5.02%的用户

### 3. 迭代法

```java
    Node iterator(Node root) {
        Node r = root;
        while (r!=null && r.left != null) {
            Node pre = r;
            Node cur = new Node(0);
            while (pre != null) {
                cur.next = pre.left;
                cur.next.next = pre.right;
                cur = pre.right;
                pre = pre.next;
            }
            r = r.left;
        }
        return root;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：41.7 MB, 在所有 Java 提交中击败了5.02%的用户
