package Recursion.Recursion_Basics;

public class Factorial {
    /*
     * static void factLoop(int n) {
     * for (int i = 1; i <= n; i++) {
     * int factorial = 1;
     * factorial = factorial * i;
     * }
     * return factorial;
     * }
     */

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    public static void main(String args[]) {
        int result = fact(5);
        System.out.println(result);
    }
}
