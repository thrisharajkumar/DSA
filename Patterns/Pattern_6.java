package Recursion.Patterns;

public class Pattern_6 {
    public static void main(String[] args) {
        int noOflines = 5;
        int totalSpaces = 0;
        // print lines
        for (int line = noOflines; line >= 1; line--) {
            // spaces
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }

            totalSpaces++;
            System.out.println();

        }
    }
}
