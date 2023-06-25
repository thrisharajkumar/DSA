package Recursion.MultiBranch;

/* Get all subsequences of a String and print it
i/p : String name = "ravi"
o/p : "", "r", "a", "v", "i", "ra", "rv", "ri", "rav", "rai", "rvi", "avi", "ai", "vi", "av", "ravi"
*/
//Without using arraylist
public class SubSeqTree {
    static void printSubSeq(String str, String result) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(result + ",");
            return;
        }
        // result is used go store results for printing
        // assume the string is "abc"
        // "a"
        char singleChar = str.charAt(0);

        // get the remaining strring
        // "abc" - "bc"

        String remainingString = str.substring(1);
        printSubSeq(remainingString, result);
        printSubSeq(remainingString, result + singleChar);
    }

    public static void main(String[] args) {
        printSubSeq("abc", "");
    }
}
