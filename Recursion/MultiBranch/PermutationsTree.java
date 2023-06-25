package Recursion.MultiBranch;

/*Permutation of String, Print them.
i/p : str = "abc"
o/p : "abc", "acb", "bca", "bac", "cba", "cab" */
//without using arraylist
public class PermutationsTree {

    static void printperm(String input, String output) {

        // Base Case
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        // Iterate no.of times recursion for each cahracter
        for (int i = 0; i < input.length(); i++) {
            char singleChar = input.charAt(i);
            String remainiString = input.substring(0, i) + input.substring(i + 1);
            printperm(remainiString, output + singleChar);
        }
    }

    public static void main(String[] args) {
        printperm("abc", "");
    }
}
