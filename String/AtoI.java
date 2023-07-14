package String;

public class AtoI {
    static int ConvertAtoI(String s) {
        int n = s.length();
        int r = 0;
        int sign = 1;
        int index = 0;

        // Spaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Sign
        if (index < n && s.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        else {
            if (index < n && s.charAt(index) == '+') {
                sign = 1;
                index++;
            }
        }

        // Char to int
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            r = r * 10 + digit;
            index++;
        }
        return sign * r;
    }

    public static void main(String[] args) {
        String str = "    -23";
        System.out.println(ConvertAtoI(str));
    }
}
