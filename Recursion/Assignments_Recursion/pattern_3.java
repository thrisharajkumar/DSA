package Recursion.Assignment;

public class pattern_3 {
    /*
     * Pattern-6
     *
     ***
     *****
     *******
     *********
     * with spaces
     */

    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        printPattern(n);
    }

    public static void printPattern(int n) {
        printPatternRecursive(n, 1);
    }

    private static void printPatternRecursive(int n, int row) {
        if (n == 0) {
            return;
        }

        printSpaces(n - 1);
        printStars(row);

        System.out.println(); // Move to the next line

        printPatternRecursive(n - 1, row + 2);
    }

    private static void printSpaces(int count) {
        if (count == 0) {
            return;
        }

        System.out.print(" ");
        printSpaces(count - 1);
    }

    private static void printStars(int count) {
        if (count == 0) {
            return;
        }

        System.out.print("*");
        printStars(count - 1);
    }
}
