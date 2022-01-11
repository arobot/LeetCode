package problems.p0001_0100.p0098_validate_binary_search_tree;

import utils.node.TreeNode;
import utils.node.TreeUtils;

public class ValidateBinarySerachTree {
    public static boolean isValidBST(TreeNode root) {
        return valid(root, Long.valueOf(Integer.MIN_VALUE)-1, Long.valueOf(Integer.MAX_VALUE)+1);
    }

    public static boolean valid(TreeNode node, Long min, Long max) {
        if (node == null)
            return true;
        if (node.val <= min || max <= node.val)
            return false;
        return valid(node.left, min, Long.valueOf(node.val)) && valid(node.right, Long.valueOf(node.val), max);
    }

    public static void main(String[] args) {
        // TreeNode root = TreeUtils.fullBinaryTree(1, 0, 2);
        // root.left = new TreeNode(-2);
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(6, new TreeNode(3), new TreeNode(7)));

        // root = new TreeNode(1, null, new TreeNode(1));

        // root = new TreeNode(32,
        //         new TreeNode(26, new TreeNode(19, null, new TreeNode(27)), null),
        //         new TreeNode(47, null, new TreeNode(56)));

        // root = new TreeNode(Integer.MAX_VALUE);
        System.out.println(isValidBST(root));
    }
}
