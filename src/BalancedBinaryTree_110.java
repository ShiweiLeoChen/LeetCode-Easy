import __HELPER_CLASSES__.TreeNode;

public class BalancedBinaryTree_110 {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        else if (root.left == null && root.right == null) {
            return true;
        }
        else if (Math.abs(MaxDepthBTree_104.maxDepth(root.left) - MaxDepthBTree_104.maxDepth(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode t = TreeNode.str2Tree(args[0]);
        TreeNode.printTree(t);
        System.out.println("Is the BST balanced? "+isBalanced(t));
    }
}
