public class PalindromeNumber_9 {

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int length = s.length();

        int temp;
        if (length % 2 == 0) {
            temp = length / 2;
        }
        else {
            temp = (length - 1) / 2;
        }

        int i = 0;
        int j = length - 1;
        do {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        } while (i <= temp && j >= temp);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(Integer.parseInt(args[0])));
    }
}
