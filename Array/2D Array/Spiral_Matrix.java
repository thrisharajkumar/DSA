import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    // LC : 54
    /*
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [1,2,3,6,9,8,7,4,5]
     */
    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        int k = 0;
        int l = 0;

        while (k < m && l < n) {
            // Traverse the first row
            for (int i = l; i < n; i++) {
                result.add(arr[k][i]);
            }
            k++;

            // Traverse the last column
            for (int i = k; i < m; i++) {
                result.add(arr[i][n - 1]);
            }
            n--;

            if (k < m) {
                // Traverse the last row
                for (int i = n - 1; i >= l; i--) {
                    result.add(arr[m - 1][i]);
                }
                m--;
            }

            if (l < n) {
                // Traverse the first column
                for (int i = m - 1; i >= k; i--) {
                    result.add(arr[i][l]);
                }
                l++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 1, 2, 3 },
                { 4, 5, 6, 7 } };
        List<Integer> result = spiralOrder(arr);
        System.out.println(result);

    }
}
