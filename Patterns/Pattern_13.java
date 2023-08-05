package Recursion.Patterns;

public class Pattern_13 {
    public static void main(String[] args) {
        int noOflines = 9;
        int mid = noOflines / 2;
        int totalSpaces = mid;
        int totalStars = 1;
        for (int line = 1; line <= noOflines; line++) {
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= totalStars; star++) {
                System.out.print("*");
            }
            if (line < mid) {
                totalStars++;
                totalSpaces--;
            } else {
                totalStars--;
                totalSpaces++;
            }
            System.out.println();
        }
    }
}
