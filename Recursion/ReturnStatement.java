package Recursion.Recursion_Basics;

public class ReturnStatement {
    static void func(int n) {
        // Base case or Terminating case
        if (n == 0) {
            return;
        }
        // Processing logic
        System.out.println("Recursion Call.. " + n);
        // Small problem
        func(n - 1);
    }

    public static void main(String[] args) {
        func(5);
    }
}
