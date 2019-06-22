import __HELPER_CLASSES__.StrIntArr;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_168 {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        for (int i : nums) {
            dict.merge(i, 1, Integer::sum);
        }

        return Collections.max(dict.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static int majorityElement_faster(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }
            count += (i == candidate)? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntToIntArr(args[0]);
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement_faster(arr));
    }
}
