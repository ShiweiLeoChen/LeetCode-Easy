import __HELPER_CLASSES__.StrIntArr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {0, 0};
        for (int i = 0; i < nums.length-1; i++) {
            boolean found = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        return ans;
    }

    public static int[] twoSum1(int[] nums, int target) throws IllegalArgumentException{
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int[] ans = {map.get(complement), i};
                return ans;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution found.");
    }

    public static void main(String[] args) {
        int[] nums = StrIntArr.strIntArr(args[0]);

        System.out.println(Arrays.toString(twoSum1(nums, Integer.parseInt(args[1]))));
    }
}
