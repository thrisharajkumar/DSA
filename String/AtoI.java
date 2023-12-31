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
            // if the range of number is greater than int
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                if (r <= Integer.MIN_VALUE / 10) {
                    return Integer.MIN_VALUE;
                }
            }
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
