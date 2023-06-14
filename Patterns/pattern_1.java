package Recursion.Patterns;

public class pattern1 {

    /*
     * 
     * *
     * **
     * ***
     * ****
     */
    static void printStar(int noOfStar) {
        // Base case
        if (noOfStar == 0) {
            return;
        }
        // Processing logic
        System.out.print("*");
        // Small problem
        printStar(noOfStar - 1);
    }

    static void printPattern(int rows, int currentRow) {
        if (rows == 0) {
            return;
        }
        printStar(currentRow); // print the row
        System.out.println();
        printPattern(rows - 1, currentRow + 1);
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
