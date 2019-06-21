import __HELPER_CLASSES__.StrIntArr;

public class DuplicateRemovalSortedArray_26 {
    private static int removeDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int index = 0;
        int temp = Integer.MIN_VALUE;
        for (int i : nums) {
            if (temp != i) {
                temp = i;
                nums[index] = temp;
                index++;
            }
        }

        //System.out.println(Arrays.toString(nums));
        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate(StrIntArr.strIntArr(args[0])));
    }
}
