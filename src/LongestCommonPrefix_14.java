import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || Arrays.asList(strs).contains("")) {
            return "";
        }

        int shortest_index = 0;
        int shortest_length = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortest_length) {
                shortest_index = i;
                shortest_length = strs[i].length();
            }
        }

        for (int i = 0; i < shortest_length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (j == shortest_index) {
                    continue;
                }
                else {
                    if (!strs[j].substring(i, i+1).equals(strs[shortest_index].substring(i, i+1))) {
                        if (i == 0) {
                            return "";
                        }
                        else {
                            return strs[shortest_index].substring(0, i);
                        }
                    }
                }
            }
        }

        return strs[shortest_index];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(args));
    }
}
