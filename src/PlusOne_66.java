import __HELPER_CLASSES__.StrIntArr;

import java.util.Arrays;

public class PlusOne_66 {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            if (carry == 1) {
                if (i != 0 && digits[i] == 9) {
                    digits[i] = 0;
                }
                else if (i == 0 && digits[i] == 9) {
                    int[] expanded_digits = new int[digits.length+1];
                    digits[i] = 0;
                    expanded_digits[0] = 1;
                    System.arraycopy(digits, 0, expanded_digits, 1, digits.length);
                    return expanded_digits;
                }
                else {
                    digits[i]++;
                    carry = 0;
                }
            }
            else {
                break;
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(StrIntArr.strIntArr(args[0]))));
    }
}
