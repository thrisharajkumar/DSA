package Recursion.Recursion_Basics;

public class SumOfDigit {
    static int SumUsingLoop(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    static int SumUsingRec(int n, int sum) {
        // Terminating case
        if (n == 0) {
            return sum;
        }
        // Processing Logic
        sum += n % 10;
        // Small Problem
        n = n / 10;
        return SumUsingRec(n, sum);
    }

    public static void main(String[] args) {
        System.out.println(SumUsingLoop(2312));
    }
}
