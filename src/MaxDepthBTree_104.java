import __HELPER_CLASSES__.TreeNode;

public class MaxDepthBTree_104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    public static void main(String[] args) {
        TreeNode tree = TreeNode.str2Tree(args[0]);
        TreeNode.printTree(tree);
        System.out.print("Minimum Depth = "+maxDepth(tree));
    }
}
