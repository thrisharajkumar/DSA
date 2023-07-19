public class Transpose_Matrix {
    public static void main(String[] args) {

        int x[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 7, 8, 9 } };

        int temp = 0;
        System.out.println("Before Transpose");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j] + ",");
            }
            System.out.println();
        }

        for (int i = 0; i < x.length; i++) {

            // j = i+1 because the values does not change again
            for (int j = i + 1; j < x[i].length; j++) {
                temp = x[i][j];
                x[i][j] = x[j][i];
                x[j][i] = temp;
            }
            System.out.println();
        }

        System.out.println("After Tranpose");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j] + ",");
            }
            System.out.println();
        }

    }
}
