package Recursion.Assignment;

//USING RECURSION
public class ClimbingStairsRec {
    static int ClimStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return ClimStairs(n - 2) + ClimStairs(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int result = ClimStairs(n);
        System.out.println(result);
    }
}
