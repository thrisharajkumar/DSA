package Recursion.Assignment_4;

//WITHOUT RECURSION
public class ClimbingStairsLeetCode {
    public static int ClimbingStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] ways = new int[n + 1];

        ways[0] = 1;
        ways[1] = 1;

        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 2] + ways[i - 1];

        }

        return ways[n];

    }

    public static void main(String[] args) {
        int n = 4;
        int result = ClimbingStairs(n);
        System.out.println(result);
    }
}
