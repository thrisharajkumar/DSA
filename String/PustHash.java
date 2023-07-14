package String;

public class PustHash {
    static String putHash(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // result.append(str.charAt(i));

            if (i < str.length() - 1 && str.charAt(i) == str.charAt((i + 1))) {
                result.append(str.charAt(i));
                result.append("#");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(putHash(str));
    }
}
