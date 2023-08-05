package Recursion.Patterns;

public class Pattern_5 {

    // Left Pyramid
    public static void main(String[] args) {
        int noOflines = 5;
        int totalSpaces = noOflines - 1;
        // print lines
        for (int line = 1; line <= noOflines; line++) {
            // Print stars in each line
            // spaces
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }

            totalSpaces--;
            System.out.println();

        }
    }
}
