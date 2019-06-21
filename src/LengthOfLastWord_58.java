import java.util.Arrays;

public class LengthOfLastWord_58 {
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");

        if (str.length == 0) {
            return 0;
        }

        //System.out.println(Arrays.toString(str));
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(args[0]));
    }
}
