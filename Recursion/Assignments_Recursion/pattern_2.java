package Recursion.Assignment;

public class pattern_2 {
    /*
     * Pattern-5
     * A
     * BB
     * CCC
     * DDDD
     * EEEEE
     */

    public static void printPattern(int n) {
        if (n > 0) {
            printPattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print((char) ('A' + n - 1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
