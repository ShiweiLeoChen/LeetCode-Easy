import __HELPER_CLASSES__.StrIntArr;

import java.util.Arrays;

public class SortedArrayMerge_88 {
    public static void bubbleSort(int[] nums) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < nums.length-1; i++) {
            swapped = false;
            for (j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 || nums2.length == 0) {
            return;
        }

        System.arraycopy(nums2, 0, nums1, m, n);

        bubbleSort(nums1);
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 || nums2.length == 0) {
            return;
        }

        for (int i = n+m-1; i >= 0; i--) {
            if (m != 0 && n != 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[i] = nums1[m - 1];
                    m--;
                } else {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            }
            else if (m == 0 && n != 0) {
                nums1[i] = nums2[n - 1];
                n--;
            }
            else if (m != 0 && n ==0){
                nums1[i] = nums1[m - 1];
                m--;
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = StrIntArr.strIntArr(args[0]);
        int[] nums2 = StrIntArr.strIntArr(args[2]);

        merge1(nums1, Integer.parseInt(args[1]), nums2, Integer.parseInt(args[3]));

        System.out.println(Arrays.toString(nums1));
    }
}
