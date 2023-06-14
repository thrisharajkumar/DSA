package Recursion.Array;

import java.util.ArrayList;

public class SubSeqRec {
    /*
     * Get all subsequences of a String and Store in ArrayList and return it
     * i/p : String name = "ravi"
     * o/p : ["", "r", "a", "v", "i", "ra", "rv", "ri", "rav", "rai", "rvi", "avi",
     * "ai", "vi", "av", "ravi"]
     */

    static ArrayList<String> solution(String str) {
        if (str.length() == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
        }
        // str ="ravi"
        // currentcaher = 'r'
        char currentChar = str.charAt(0);
        // remainingString ="avi"
        String remainingString = str.substring(1);
        ArrayList<String> temp = solution(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for (String s : temp) {
            result.add(s);
            result.add(currentChar + s);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ravi";
        ArrayList<String> result = solution(str);
        System.out.println(result);
    }
}
