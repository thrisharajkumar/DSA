package String;

public class Suffix {
    static void findSuffix(String str) {
        int n = str.length();
        String[] suffixes = new String[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = str.substring(n - 1 - i);
        }

        for (String i : suffixes) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String str = "Brain";
        findSuffix(str);
    }
}
