package Recursion.Array;

import java.util.ArrayList;

public class PermutationString {
    /*
     * Permutation of String
     * i/p : str = "abc"
     * o/p : ["abc", "acb", "bca", "bac", "cba", "cab"]
     */
    static ArrayList<String> permutation(String str) {
        // Base case
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char currentChar = str.charAt(0);
        String remaningString = str.substring(1);

        ArrayList<String> temp = permutation(remaningString);
        ArrayList<String> result = new ArrayList<>();

        // until here code for string subsequences 2^n sets

        for (String s : temp) {

            for (int i = 0; i <= s.length(); i++) {

                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, currentChar);
                result.add(sb.toString());
            }

        }
        return result;

    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = permutation(str);
        System.out.println(result);
    }
}
