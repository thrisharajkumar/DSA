package Recursion.Branches;
//Fibonacci series

//Branching in recursion

public class Fibonacci {
    static int fib(int n) {
        // Tree Recursion
        // Base case
        if(n<=1) {
            return n;
        }
        int first = fib(n-1);
        int second = fib(n-2);
        int res = first + second;
        return res;
    }

    public static void main(String[] args) {
        fib(5);
    }
}
