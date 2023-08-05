package Recursion.Assignment;

public class Armstrong {
    public static boolean isAmrstrong(int n) {
        int OriginalNumber = n;
        int numDigits = countDigits(n);
        int sum = calculateSumOfDigits(n, numDigits);

        return sum == OriginalNumber;
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }

    }

    public static int calculateSumOfDigits(int n, int numDigits) {
        if (n == 0) {
            return 0;
        } else {
            int digit = n % 10;
            return (int) (Math.pow(digit, numDigits) + calculateSumOfDigits(n / 10, numDigits));
        }
    }

    public static void main(String args[]) {
        int n = 153;
        if (isAmrstrong(n)) {
            System.out.println(n + " Armstrong number");
        } else {
            System.out.println(n + " Not Armstrong number");
        }
    }
}
