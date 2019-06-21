import __HELPER_CLASSES__.TreeNode;

public class SameTree_100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        else if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        else {
            if (p.val != q.val) {
                return false;
            }
            else {
                return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = TreeNode.str2Tree(args[0]);
        TreeNode t2 = TreeNode.str2Tree(args[1]);
        TreeNode.printTree(t1);
        TreeNode.printTree(t2);
        System.out.println(isSameTree(t1, t2));
    }
}
