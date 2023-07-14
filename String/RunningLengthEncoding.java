package String;

public class RunningLengthEncoding {
    static void rle(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while ((i < n - 1) && (str.charAt(i) == str.charAt(i + 1))) {
                i++;
                count += 1;
            }
            System.out.println(str.charAt(i) + "" + count);

        }

    }

    public static void main(String[] args) {
        rle("aaabbcccc");
    }
}
