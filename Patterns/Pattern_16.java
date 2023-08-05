package Recursion.Patterns;

public class Pattern_16 {
    public static void main(String[] args) {
        // same as inverted pyramid
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Right angle triangle
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (rows * 2 - (2 * i - 1)); k++) {
                // i ==1 - first row
                // k == 1 - first column
                if (i == 1 || k == 1 || k == rows * 2 - (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
