import __HELPER_CLASSES__.TreeNode;

public class _PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        else if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        else {
            return hasPathSum(root.left, sum - root.val) ||
                    hasPathSum(root.right, sum - root.val);
        }
    }

    public static void main(String[] args) {
        TreeNode t = TreeNode.str2Tree(args[0]);
        TreeNode.printTree(t);
        System.out.println("Has path sum to "+Integer.parseInt(args[1])+"? "
                +hasPathSum(t, Integer.parseInt(args[1])));
    }
}
