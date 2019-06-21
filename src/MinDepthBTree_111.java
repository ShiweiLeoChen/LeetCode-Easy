import __HELPER_CLASSES__.TreeNode;

public class MinDepthBTree_111 {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else if (root.left == null && root.right == null) {
            return 1;
        }
        else if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        }
        else if (root.left != null && root.right == null) {
            return 1 + minDepth(root.left);
        }
        else {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }

    public static void main(String[] args) {
        TreeNode tree = TreeNode.str2Tree(args[0]);
        TreeNode.printTree(tree);
        System.out.print("Minimum Depth = "+minDepth(tree));
    }
}
