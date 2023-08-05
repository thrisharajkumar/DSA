package Recursion.Patterns;

public class Pattern_10 {
    public static void main(String[] args) {

        int noOflines = 6;
        int leftSpace = noOflines - 1;
        int rightSpace = 0;

        for (int line = 1; line <= noOflines; line++) {
            for (int space = 1; space <= leftSpace; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            leftSpace--;
            for (int space = 1; space <= rightSpace; space++) {
                System.out.print(" ");
            }
            rightSpace++;
            System.out.println();
        }
    }

}