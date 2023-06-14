package Recursion.Array;

import java.util.ArrayList;

public class Subsequences {

    /*
     * Get all subsequences of a String and Store in ArrayList and return it
     * i/p : String name = "ravi"
     * o/p : ["", "r", "a", "v", "i", "ra", "rv", "ri", "rav", "rai", "rvi", "avi",
     * "ai", "vi", "av", "ravi"]
     */
    // ITERATIVE CASE
    // Get the power set of a String and store
    // in arraylist and return it

    static ArrayList<String> solution(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (list.size() == 0) {
                list.add("");
                // "" + currentCar - because currentChar data type is char
                // add our list store only string tyoe of data
                // so after concatination it will become string type of data
                list.add("" + currentChar);
                continue;
            }
            int n = list.size();
            for (int j = 0; j < n; j++) {
                String temp = list.get(j) + currentChar;
                if (!list.contains(temp)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String str = "ravi";
        ArrayList<String> output = solution(str);
        System.out.println(output);
    }
}
