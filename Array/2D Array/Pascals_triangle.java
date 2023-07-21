import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle {
    /*
     * Input: numRows = 5
     * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     */

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        tri.add(new ArrayList<>());
        // {{1}}
        tri.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(); // current row
            List<Integer> prevRow = tri.get(i - 1); // previous row
            // first elemenet of row is 1
            row.add(1);
            for (int j = 1; j < i; j++) {
                // to add the 1 index value of previous and
                // 2 index value of previous row
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // last elemenet of row is 1
            row.add(1);
            tri.add(row);
        }
        return tri;
    }

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> ans = generate(rows);
        System.out.println(ans);
    }
}
