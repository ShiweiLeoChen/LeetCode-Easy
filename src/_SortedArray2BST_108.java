import __HELPER_CLASSES__.TreeNode;
import __HELPER_CLASSES__.StrIntArr;

public class _SortedArray2BST_108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        else {
            return createBST(nums, 0, nums.length-1);
        }
    }

    private static TreeNode createBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        else {
            int mid = (start + end) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = createBST(nums, start, mid - 1);
            node.right = createBST(nums, mid + 1, end);
            return node;
        }
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntArr(args[0]);
        TreeNode.printTree(sortedArrayToBST(arr));
    }
}
