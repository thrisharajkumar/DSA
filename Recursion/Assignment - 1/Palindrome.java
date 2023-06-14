package Recursion.Assignment_1;

public class Palindrome {

    static boolean isPalindrome(String s) {
        //Check if a string is palindrome or not.
        // Terminating case or base case
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String word1 = "level";
        String word2 = "hello";

        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
    }
}
