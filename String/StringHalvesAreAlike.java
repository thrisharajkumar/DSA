package String;

public class StringHalvesAreAlike {

    static boolean halvesAreAlike(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I'
                    || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
                c1 += 1;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I'
                    || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
                c2 += 1;
            }
        }
        if (c1 == c2) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(halvesAreAlike(str));
    }
}
