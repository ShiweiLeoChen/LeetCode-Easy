public class ImplementStrStr_28 {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        try {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
            return -1;
        } catch (IndexOutOfBoundsException ioe) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(strStr(args[0], args[1]));
    }
}
