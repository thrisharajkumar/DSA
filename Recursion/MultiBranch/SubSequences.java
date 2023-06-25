package Recursion.MultiBranch;

public class SubSequences {

    static void printSubSeq(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result + "");
            return;
        }
        // result is used to store results for printing
        // assume the string is 'abc'
        // "abc" - 'a'

        char singleChar = str.charAt(0);
        // get remaining string
        // "abc" - "bc"

        String remainiString = str.substring(1);
        printSubSeq(remainiString, result);
        printSubSeq(remainiString, result + singleChar);
    }

    public static void main(String[] args) {
        printSubSeq("abc", "");
    }
}
