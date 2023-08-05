package Recursion.Patterns;

public class Pattern_8 {
    public static void main(String[] args) {
        int noOflines = 7;
        int totalSpaces = noOflines - 1;
        for (int line = 0; line <= noOflines - 1; line++) {
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }
            int oddcompute = 2 * line + 1;
            for (int star = 1; star <= oddcompute; star++) {
                System.out.print("*");
            }
            totalSpaces--;
            System.out.println();
        }
    }
}
