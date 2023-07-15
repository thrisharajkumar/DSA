package Tries;

public class PrefixTries {
    static class Node {
        Node[] children;
        boolean isTerminal;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            isTerminal = false;
        }
    }

    static Node root = new Node();

    static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }

            if (i == word.length() - 1) {
                current.children[index].isTerminal = true;
                System.out.println("Word is inserted: " + word);
            }

            current = current.children[index];
        }
    }

    static void insertPrefix(String word) {
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            insert(prefix);
        }
    }

    public static void main(String[] args) {
        insertPrefix("Brain");
    }
}
