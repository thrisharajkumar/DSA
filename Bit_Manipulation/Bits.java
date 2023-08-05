package Bit_Manipulation;

public class Bits {
    public static void main(String[] args) {
        // Get ith bit

        int n = 12;
        int k = 3;
        int mask = 1 << k;
        if ((n & mask) > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}
