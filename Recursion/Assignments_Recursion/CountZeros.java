package Recursion.Assignment;

public class CountZeros {
    static int CountZeroLoop1(int n) {
        int count = 0;
        // converting thenumber to a String

        String nstr = String.valueOf(n);
        // iterating through each char

        for (int i = 0; i < nstr.length(); i++) {
            // Check if the char is zero

            if (nstr.charAt(i) == '0') {
                count++;
            }
        }
        return count;
        /*
         * int count = 0;
         * while (n!=0){
         * int dig = n % 10;
         * if(dig ==0){
         * count++;
         * }
         * n/=10;
         * }
         */

    }

    public static int CountZeroLoop2(int n) {
        int count = 0;
        while (n != 0) {
            int dig = n % 10;
            if (dig == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static int CountZeroRec(int n) {
        if (n == 0)
            return 0;

        if (n % 10 == 0)
            return 1 + CountZeroRec(n / 10);
        else
            return CountZeroRec(n / 10);
    }

    public static void main(String args[]) {
        System.out.println("Number of Zeros: \n");
        System.out.println(" Using loop 1: " + CountZeroLoop1(430203005));
        System.out.println(" Using loop 2: " + CountZeroLoop2(430203005));
        System.out.println(" Using recursion: " + CountZeroRec(430203005));
    }
}
