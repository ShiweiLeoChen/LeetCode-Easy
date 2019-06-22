public class ExcelSheetColNumber_171 {
    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int res = 0, base = ((int) 'A')-1;
        for (int i = chars.length-1, j = 0; i >= 0; i--, j++) {
            res += (((int) chars[i]) - base) * Math.pow(26, j);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber(args[0]));
    }
}
