import __HELPER_CLASSES__.StrIntArr;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num: nums) {
            res ^= num;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntArr(args[0]);
        System.out.println(singleNumber(arr));
    }
}
