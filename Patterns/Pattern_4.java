package Recursion.Patterns;

public class Pattern_4 {
    //
    // *****
    // ****
    // ***
    // **
    // *
    public static void main(String[] args) {
        int noOflines = 5;
        // print lines
        for (int line = noOflines; line >= 1; line--) {
            // Print stars in each line
            for (int star = 1; star <= line; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}