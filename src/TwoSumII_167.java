import __HELPER_CLASSES__.StrIntArr;
import java.util.Arrays;


public class TwoSumII_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            }
            else if (sum < target) {
                i++;
            }
            else {
                int[] res = {i+1, j+1};
                return res;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntToIntArr(args[0]);
        System.out.println(Arrays.toString(twoSum(arr, Integer.parseInt(args[1]))));
    }
}
