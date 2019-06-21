import __HELPER_CLASSES__.StrIntArr;

import java.util.Arrays;

public class _MaximumSubarray_53 {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = nums[0];
        int max = sum;
        for (int i : Arrays.copyOfRange(nums, 1, nums.length)) {
            if (sum < 0) {
                sum = i;
            }
            else {
                sum += i;
            }

            max = Math.max(sum, max);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(StrIntArr.strIntArr(args[0])));
    }
}
