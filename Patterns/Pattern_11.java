package Recursion.Patterns;

public class Pattern_11 {
    public static void main(String[] args) {
        int noOflines = 5;
        for (int line = 0; line < noOflines; line++) {
            for (int star = 0; star < noOflines; star++) {
                if (line == star || (line + star) == noOflines - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
