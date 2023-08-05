package Recursion.Patterns;

public class Pattern_14 {
    public static void main(String[] args) {
        int noOflines = 5;
        int count = 1;
        for (int line = 1; line <= noOflines; line++) {
            for (int col = 1; col <= line; col++) {

                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }
}
