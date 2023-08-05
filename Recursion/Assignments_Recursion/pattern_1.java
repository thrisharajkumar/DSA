package Recursion.Assignment;

public class pattern_1 {
    /*
     * Pattern-4
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */
    private static int currentNumber = 1;

    static void printPattern(int rows) {

        if (rows < 1) {
            return;
        }

        printPattern(rows - 1);
        // recursive call to print the previous rows
        // print current row

        for (int i = 1; i <= rows; i++) {
            System.out.print(currentNumber + " ");
            currentNumber++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
