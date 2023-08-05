package Recursion.Patterns;

public class Pattern_1 {
    // star Patterns
    // *****
    // *****
    // *****
    // *****
    // *****
    public static void main(String[] args) {
        int noOflines = 5;
        // print lines
        for (int line = 1; line <= noOflines; line++) {
            // Print stars in each line
            for (int star = 1; star <= noOflines; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
