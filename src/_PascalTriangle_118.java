import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _PascalTriangle_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int line = 1; line <= numRows; line++) {
            int C = 1;
            List<Integer> row = new ArrayList<>();
            for (int i = 1; i <= line; i++) {
                row.add(C);
                C = C * (line - i) / i;
            }
            ans.add(row);
        }

        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = generate(Integer.parseInt(args[0]));
        System.out.println("[");
        for (List<Integer> i : ans) {
            System.out.println(Arrays.toString(i.toArray()));
        }
        System.out.println("]");
    }
}
