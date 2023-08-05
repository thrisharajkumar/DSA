package Recursion.Assignment;

public class CountDigits {

    static int countLoop(int n) {
        int count = 0;
        if (n == 0) {
            count = 0;
        }
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;

    }

    static int countRec(int n) {
        // Base Case
        if (n == 0) {
            return 0;
        }
        // Processing logic
        n /= 10;
        // Small problem
        return countRec(n) + 1;

    }

    public static void main(String args[]) {
        System.out.println("Using Recursion: " + countRec(43235));
        System.out.println("Using Loop: " + countLoop(43235));
    }

}
