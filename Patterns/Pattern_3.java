package Recursion.Patterns;

public class Pattern_3 {
    // Left pyramid
    // *
    // **
    // ***
    // ****
    // *****
    public static void main(String[] args) {
        int noOflines = 5;
        // print lines
        for (int line = 1; line <= noOflines; line++) {
            // Print stars in each line
            for (int star = 1; star <= line; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
