package Recursion.Patterns;

public class Pattern_15 {
    // Inverted pyramid
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            // Right angle triangle
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (rows * 2 - (2 * i - 1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
