import __HELPER_CLASSES__.TreeNode;

import java.util.*;

public class BTreeTraversal2_107 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return ans;
        }
        queue.add(root);

        while(!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right!= null) {
                    queue.add(node.right);
                }
            }
            ans.add(0, list);
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode t = TreeNode.str2Tree(args[0]);
        TreeNode.printTree(t);
        System.out.println("BottomUp Order = "+Arrays.toString(levelOrderBottom(t).toArray()));
    }
}
