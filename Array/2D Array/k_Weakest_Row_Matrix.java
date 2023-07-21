import java.util.Arrays;

public class k_Weakest_Row_Matrix {
    /*
     * Input: mat =
     * [[1,1,0,0,0],
     * [1,1,1,1,0],
     * [1,0,0,0,0],
     * [1,1,0,0,0],
     * [1,1,1,1,1]],
     * k = 3
     * Output: [2,0,3]
     * Explanation:
     * The number of soldiers in each row is:
     * - Row 0: 2
     * - Row 1: 4
     * - Row 2: 1
     * - Row 3: 2
     * - Row 4: 5
     * The rows ordered from weakest to strongest are [2,0,3,1,4].
     */

    static int[] kWeakest(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        // m is no. of rows so we can print no. of
        // zeros in the column 1
        // index in column 2
        int pairs[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            int strength = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
                strength++;
            }
            pairs[i][0] = strength;
            pairs[i][1] = i;
        }
        // now sort the 2d array for the column 1
        // you cannot sort a 2D array like this

        /*
         * Arrays.sort(pairs);
         * int[] indexes = new int[k];
         * return indexes;
         */

        //
        /*
         * <int[]> void java.util.Arrays.sort(int[][] a, Comparator<? super int[]> c)
         * Sorts the specified array of objects according to the order induced by the
         * specified comparator. All elements in the array must be mutually comparable
         * by the specified comparator (that is, c.compare(e1, e2) must not throw a
         * ClassCastException for any elements e1 and e2 in the array).
         */
        // Sort the 2D array based on the number of non-zero elements (column 0) and
        // index (column 1)

        Arrays.sort(pairs, (a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            else
                return a[0] - b[0];
        });

        int[] indexes = new int[k];
        for (int i = 0; i < k; i++) {
            indexes[i] = pairs[i][1];
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
        int k = 3;
        int output[] = kWeakest(mat, k);
        for (int i = 0; i < output.length; i++) {
            System.out.println(kWeakest(mat, k));
        }
    }

}
