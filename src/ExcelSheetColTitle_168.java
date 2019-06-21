import java.util.ArrayList;
import java.util.List;

public class ExcelSheetColTitle_168 {
    public static String convertToTitle(int n) {
        char[] alphabet = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'
        };

        List<Character> res = new ArrayList<Character>();
        while (n > 26) {
            res.add(0, alphabet[(--n) % 26]);
            n /= 26;
        }
        res.add(0, alphabet[(n-1) % 26]);

        StringBuilder sb = new StringBuilder();
        for (char i: res) {
            sb.append(i);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(Integer.parseInt(args[0])));
    }
}
