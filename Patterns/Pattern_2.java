package Recursion.Patterns;

public class Pattern_2 {
    public static void main(String[] args) {

        // Hollow sqare star pattern
        int noOflines = 5;
        // print lines
        for (int line = 1; line <= noOflines; line++) {
            // Print stars in each line
            for (int star = 1; star <= noOflines; star++) {
                if (line == 1 || line == noOflines || star == 1 || star == noOflines) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }

    }
}
