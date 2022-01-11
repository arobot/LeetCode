package problems.p0101_0200.p0101_symmetric_tree;

import utils.node.TreeNode;

public class SymmetricTree {

    static TreeNode prevLeft;
    static TreeNode prevRight;

    public static boolean isSymmtric(TreeNode root) {
        return isSymmtric(root, root);
    }

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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2
        , new TreeNode(1, new TreeNode(3), new TreeNode(7)),
        new TreeNode(1, new TreeNode(7), new TreeNode(3))
        );
        // root.left = new TreeNode(3);
        System.out.println(isSymmtric(root));
    }
}
