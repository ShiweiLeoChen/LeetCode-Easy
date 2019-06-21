import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _PascalTriangleII_119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = null, pre = null;
        for (int i = 0; i <= rowIndex; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(j == 0 || i == j ? 1 : pre.get(j) + pre.get(j-1));
            }
            pre = row;
        }
        return row;
    }

    public static void main(String[] args){
        int rowIndex = Integer.parseInt(args[0]);
        System.out.println("The "+rowIndex+"-th row of Pascal Triangle is: "
                +Arrays.toString(getRow(rowIndex).toArray()));
    }
}
