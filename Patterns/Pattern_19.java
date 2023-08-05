package Recursion.Patterns;

public class Pattern_19 {
    public static void main(String[] args) {

        int n = 5;
        int i, j, k;

        // Upper half

        for (i = 3; i <= n; i++) {
            for (j = 0; j < n + 1 - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            for (j = 0; j < 2 * n - (2 * i - 1); j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half is a inverted pyramid
        int rows = 10;
        String s = "Skill Riser";
        n = n * 2;
        for (i = 1; i <= n; i++) {
            // Right angle triangle
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                for (k = 0; k < (n * 2 - (2 * i - 1)) / 2; k++) {
                    if (k == n / 2 - 1) {
                        System.out.print(s);
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (k = 0; k < (n * 2 - (2 * i - 1)); k++) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
