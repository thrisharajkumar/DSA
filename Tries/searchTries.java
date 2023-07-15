package Tries;

public class searchTries {
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

            }

            current = current.children[index];
        }
    }

    static boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            Node node = current.children[index];
            if (node == null) {
                return false;
            }
            if (i == word.length() - 1 && node.isTerminal == false) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = { "apple", "ape", "axe", "ball", "bag" };
        for (String i : arr) {
            insert(i);
        }

        boolean ans = search("axe");
        System.out.println("The word exists: " + ans);
    }
}
