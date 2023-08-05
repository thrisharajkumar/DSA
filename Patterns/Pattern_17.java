package Recursion.Patterns;

public class Pattern_17 {
    // Hollow diamond pattern
    // 4 pattern combination
    // upper half - inverted /reverse triangle -2 --> loop 1

    // lower half - triangle mirrors --> loop2

    public static void main(String[] args) {
        // rows in top and bottom total = 10 if n =5
        int n = 5;
        int i, j, k;

        // Upper half

        for (i = 1; i <= n; i++) {
            for (j = 6; j > i; j--) {
                System.out.print("*");
            }
            for (k = 1; k <= 2 * i - 2; k++) {
                System.out.print(" ");
            }
            for (j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half

        for (i = 1; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (k = 2 * i - 2; k < 2 * n - 2; k++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
