import __HELPER_CLASSES__.StrIntArr;

public class SearchInsertPosition_35 {
    public static int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) {
            return 0;
        }

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] <= target && target <= nums[j]) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntArr(args[0]);

        System.out.println(searchInsert(arr, Integer.parseInt(args[1])));
    }
}
