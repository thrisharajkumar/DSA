import java.util.ArrayList;
import java.util.List;

public class Lucky_Number {
    // LC: 1380
    /*
     * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
     * Output: [15]
     * Explanation: 15 is the only lucky
     * number since it is the minimum
     * in its row and the
     * maximum in its column.
     */
    static public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minRow = new ArrayList<>();
        List<Integer> maxCol = new ArrayList<>();

        List<Integer> Result = new ArrayList<>();
        // we have to find minimum
        // from each row and maximum
        // from each column
        int minRowE = Integer.MAX_VALUE;
        int maxColE = Integer.MIN_VALUE;

        // Min of each row

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                minRowE = Math.min(minRowE, matrix[i][j]);
            }
            minRow.add(minRowE);
            minRowE = Integer.MAX_VALUE;
        }

        // Max of each column

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                maxColE = Math.max(maxColE, matrix[j][i]);
            }
            maxCol.add(maxColE);
            maxColE = Integer.MIN_VALUE;

        }
        for (int each : minRow) {
            if (maxCol.contains(each)) {
                Result.add(each);
            }
        }
        return Result;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 15, 16, 17 }
        };
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);

    }
}
