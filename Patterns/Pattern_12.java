package Recursion.Patterns;

public class Pattern_12 {
    public static void main(String[] args) {
        int noOflines = 9;
        int mid = noOflines / 2;
        int totalStars = 1;

        for (int line = 1; line <= noOflines; line++) {
            for (int star = 1; star <= totalStars; star++) {
                System.out.print("*");
            }
            if (line < mid) {
                totalStars++;
            } else {
                totalStars--;
            }
            System.out.println();
        }
    }
}
