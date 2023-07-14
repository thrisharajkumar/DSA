package String;

import java.util.ArrayList;
import java.util.List;

public class LCS {

    static String lcs(String str1, String str2) {
        List<String> subsequences1 = generateSubsequences(str1);
        List<String> subsequences2 = generateSubsequences(str2);

        String lcs = "";
        for (String word1 : subsequences1) {
            for (String word2 : subsequences2) {
                if (word1.equals(word2) && word1.length() > lcs.length()) {
                    lcs = word1;
                }
            }
        }
        return lcs;
    }

    static List<String> generateSubsequences(String str) {
        ArrayList<String> subseqList = new ArrayList<>();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char firstchar = str.charAt(i);
            if (subseqList.size() == 0) {
                subseqList.add("");
                subseqList.add("" + firstchar);
                continue;
            }
            int subLen = subseqList.size();
            for (int j = 0; j < subLen; j++) {
                String temp = subseqList.get(j) + firstchar;
                subseqList.add(temp);
            }

        }
        return subseqList;
    }

    public static void main(String[] args) {

        String str1 = "ayc";
        String str2 = "abc";
        String ans = lcs(str1, str2);
        System.out.println(ans);
    }
}
