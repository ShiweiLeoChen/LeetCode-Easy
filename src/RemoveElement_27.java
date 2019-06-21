import __HELPER_CLASSES__.StrIntArr;

import java.util.Arrays;

public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i : nums) {
            if (i != val) {
                nums[count] = i;
                count++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntArr(args[0]);

        System.out.println(removeElement(arr, Integer.parseInt(args[1])));
    }
}
