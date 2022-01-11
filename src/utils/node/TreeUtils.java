package utils.node;

public class TreeUtils {
    public static TreeNode fullBinaryTree(int root, int level, int maxLevel) {
        if (level == maxLevel - 1) {
            return new TreeNode(root);
        }
        level++;
        TreeNode node = new TreeNode(root);
        node.left = fullBinaryTree(2 * root, level, maxLevel);
        node.right = fullBinaryTree(2 * root + 1, level, maxLevel);
        return node;
    }

    public static void printNode(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        printNode(node.left);
        printNode(node.right);
    }

    public static void main(String[] args) {
        TreeNode node = fullBinaryTree(1, 0, 3);
        printNode(node);
    }
}
