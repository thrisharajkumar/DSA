package Recursion.Patterns;

public class Pattern_9 {
    public static void main(String[] args) {
        int noOflines = 6;
        int midpoint = noOflines / 2;
        int totalSpaces = midpoint;
        int starCount = 1;
        for (int line = 1; line <= noOflines; line++) {
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= starCount; star++) {
                System.out.print("*");
            }
            if (line < midpoint) {// upper pyramid
                starCount += 2;
                totalSpaces--;
            }
            if (line > midpoint) {// lower pyramid
                starCount -= 2;
                totalSpaces++;
            }
            System.out.println();
        }
    }
}
