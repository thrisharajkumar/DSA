import java.util.Arrays;

public class CaptilizedArray {

    /*
     * Write recursive function that takes an array of words and returns an array
     * containing all words capitalized
     * i/p : ["foo", "bar", "world"]
     * o/p : ["FOO", "BAR", "WORLD"]
     */
    public static String[] capitalizeWords(String[] words) {
        return capitalizeWordsHelper(words, 0);
    }

    public static String[] capitalizeWordsHelper(String[] words, int index) {
        if (index == words.length) {
            return new String[words.length];
        } else {
            String currentWord = words[index];
            String capitalizedWord = currentWord.toUpperCase();
            String[] capitalizedWords = capitalizeWordsHelper(words, index + 1);
            capitalizedWords[index] = capitalizedWord;

            return capitalizedWords;
        }

    }

    public static void main(String[] args) {
        String[] words = { "foo", "bar", "world" };
        System.out.println("Words:\n" + Arrays.toString(words));
        String[] capitalizedWords = capitalizeWords(words);
        System.out.println("Capitalized words:");
        System.out.println(Arrays.toString(capitalizedWords));

    }
}
