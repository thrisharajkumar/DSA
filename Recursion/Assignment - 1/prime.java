package Recursion.Assignment_1;

public class prime {
    //Check the given number is Prime Number or not.
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
        int n = 17;
        if (isprime(n)) {
            System.out.println(n + " is Prime number");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}
