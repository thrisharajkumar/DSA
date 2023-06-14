package Recursion.Assignment_1;

public class primeinRange {

    public static int CountPrimeInRange(int start, int end) {
        if (start > end) {
            return 0;
        }

        else {
            boolean isPrime = isprime(start);
            int count = CountPrimeInRange(start + 1, end);
            return isPrime ? 1 + count : count;
        }
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        } else {
            return PrimeRecursive(n, 2);
        }
    }

    static boolean PrimeRecursive(int n, int divisor) {
        if (divisor == n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return PrimeRecursive(n, divisor + 1);
    }

    public static void main(String args[]) {
        int start = 1;
        int end = 100;
        int primeCount = CountPrimeInRange(start, end);
        System.out.println("Prime number in Range " + start + " to " + end + "=" + primeCount);
    }
}
